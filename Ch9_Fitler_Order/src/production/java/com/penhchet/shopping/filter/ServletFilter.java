package com.penhchet.shopping.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletFilter implements Filter{

	public ServletFilter() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet FILTER CONSTRUCTOR...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet Filter...");
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet FILTER INIT...");
		
	}

}
