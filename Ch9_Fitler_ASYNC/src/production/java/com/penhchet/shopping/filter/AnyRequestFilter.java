package com.penhchet.shopping.filter;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class AnyRequestFilter implements Filter{

	private String name;
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.name = config.getFilterName();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("ENTERING "+ this.name +".doFilter()");
		chain.doFilter(
				new HttpServletRequestWrapper((HttpServletRequest)request),
				new HttpServletResponseWrapper((HttpServletResponse)response));
		if(request.isAsyncStarted() && request.isAsyncSupported()){
			AsyncContext context = request.getAsyncContext();
			System.out.println("LEAVING " + this.name +".doFilter(), async " +
							   "context holds wrapped request/response = " +
							   !context.hasOriginalRequestAndResponse());
			System.out.println("LEAVING " + this.name + ".doFilter().");
			 
		}
	}

	@Override
	public void destroy() {
		
	}
	
}
