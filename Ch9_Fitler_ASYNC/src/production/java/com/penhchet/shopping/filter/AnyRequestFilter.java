package com.penhchet.shopping.filter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.AsyncContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class AnyRequestFilter implements Filter {

	private String name;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.name = config.getFilterName();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("ENTERING " + this.name + ".doFilter()");
		chain.doFilter(new HttpServletRequestWrapper(
				(HttpServletRequest) request), new HttpServletResponseWrapper(
				(HttpServletResponse) response));
		if (request.isAsyncStarted() && request.isAsyncSupported()) {
			AsyncContext context = request.getAsyncContext();
			System.out.println("LEAVING " + this.name + ".doFilter(), async "
					+ "context holds wrapped request/response = "
					+ !context.hasOriginalRequestAndResponse());
			System.out.println("LEAVING " + this.name + ".doFilter().");

		}
	}

	@Override
	public void destroy() {

	}

	private static class ResponseWrapper extends HttpServletResponseWrapper {
		private GZIPServletOutputStream outputStream;
		private PrintWriter writer;

		public ResponseWrapper(HttpServletResponse request) {
			super(request);
		}

		@Override
		public synchronized ServletOutputStream getOutputStream()
				throws IOException {
			if (this.writer != null)
				throw new IllegalStateException("getWriter() already called.");
			if (this.outputStream == null)
				this.outputStream = new GZIPServletOutputStream(
						super.getOutputStream());
			return this.outputStream;
		}

		@Override
		public synchronized PrintWriter getWriter() throws IOException {
			if (this.writer == null && this.outputStream != null)
				throw new IllegalStateException(
						"getOutputStream() already called.");
			if (this.writer == null) {
				this.outputStream = new GZIPServletOutputStream(
						super.getOutputStream());
				this.writer = new PrintWriter(new OutputStreamWriter(
						this.outputStream, this.getCharacterEncoding()));
			}
			return this.writer;
		}

		@Override
		public void flushBuffer() throws IOException {
			if (this.writer != null)
				this.writer.flush();
			else if (this.outputStream != null)
				this.outputStream.flush();
			super.flushBuffer();
		}

		@Override
		public void setContentLength(int length) {
		}

		@Override
		public void setContentLengthLong(long length) {
		}

		@Override
		public void setHeader(String name, String value) {
			if (!"content-length".equalsIgnoreCase(name))
				super.setHeader(name, value);
		}

		@Override
		public void addHeader(String name, String value) {
			if (!"content-length".equalsIgnoreCase(name))
				super.setHeader(name, value);
		}

		@Override
		public void setIntHeader(String name, int value) {
			if (!"content-length".equalsIgnoreCase(name))
				super.setIntHeader(name, value);
		}

		@Override
		public void addIntHeader(String name, int value) {
			if (!"content-length".equalsIgnoreCase(name))
				super.setIntHeader(name, value);
		}

		public void finish() throws IOException {

			if (this.writer != null)
				this.writer.close();
			else if (this.outputStream != null)
				this.outputStream.finish();
		}
	}

	private static class GZIPServletOutputStream extends ServletOutputStream {
		private final ServletOutputStream servletOutputStream;
		private final GZIPOutputStream gzipStream;

		public GZIPServletOutputStream(ServletOutputStream servletOutputStream)
				throws IOException {
			this.servletOutputStream = servletOutputStream;
			this.gzipStream = new GZIPOutputStream(servletOutputStream);
		}

		@Override
		public boolean isReady() {
			return this.servletOutputStream.isReady();
		}

		@Override
		public void setWriteListener(WriteListener writeListener) {
			this.servletOutputStream.setWriteListener(writeListener);
		}

		@Override
		public void write(int b) throws IOException {
			this.gzipStream.write(b);
		}

		@Override
		public void close() throws IOException {
			this.gzipStream.close();
		}

		@Override
		public void flush() throws IOException {
			this.gzipStream.flush();
		}

		public void finish() throws IOException {
			this.gzipStream.finish();
		}
	}

}
