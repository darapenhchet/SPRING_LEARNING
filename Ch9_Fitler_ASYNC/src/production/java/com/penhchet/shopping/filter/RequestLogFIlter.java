package com.penhchet.shopping.filter;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StopWatch;

public class RequestLogFIlter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		Instant time = Instant.now();
		StopWatch timer = new StopWatch();
		try{
			timer.start();
			chain.doFilter(request, response);
		}finally{
			timer.stop();
			HttpServletRequest in = (HttpServletRequest)request;
			HttpServletResponse out = (HttpServletResponse)response;
			String length = out.getHeader("Content-Length");
			if(length == null || length.length() ==0){
				length ="-";
				System.out.println(in.getRemoteAddr() + " - - [" + time +" ]" +
						" \"" + in.getMethod() + " " + in.getRequestURI() + " " +
						in.getProtocol() + " \" " + out.getStatus() + " " + length + " " + timer);
				
				
			}
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}
