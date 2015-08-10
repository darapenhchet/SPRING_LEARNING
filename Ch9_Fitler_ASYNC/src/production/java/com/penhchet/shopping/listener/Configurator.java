package com.penhchet.shopping.listener;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.penhchet.shopping.filter.CompressionFilter;
import com.penhchet.shopping.filter.MyFilter;
import com.penhchet.shopping.filter.RequestLogFIlter;

//ADD LISTENER ANNOTATION
//@WebListener
public class Configurator implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		/*  
		 *  1. Get Servlet Context
		 *  2. Register Filter To Servlet Context
		 *  3. Add Mapping to URLs or SERVLET NAMEs
		 */ 
		
		// 1. GET SERVLET CONTEXT
		ServletContext context = event.getServletContext();
		// 2. REGISTER FILTER TO SERVLET CONTEXT		
		FilterRegistration.Dynamic registration = context.addFilter("requestLogFilter", new RequestLogFIlter());
		// 3. ADD MAPPING TO URLs OR SERVLET NAMEs
		// 	  3.1. ADD MAPPING TO URLs 
		registration.addMappingForUrlPatterns(null, false, "/*");
		
		registration = context.addFilter("compressionFilter", new CompressionFilter());
		
		registration.setAsyncSupported(true);
		
		registration.addMappingForUrlPatterns(null, false, "/compression/*");
		
		//    3.2. ADD MAPPING TO SERVLET NAMEs
		// registration.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC), false, "servletName");
		
		
		/*
		 *  registration.addMappingForUrlPatterns(null, false, "/*");
		 *  	- 1st Parameter = DispatcherType
		 *  	- 2nd Parameter = Filter's order relative to filters in the deployment descriptor.
		 *  		If FALSE ==> Programmatic Filter Mapping is ordered before any other filters (JAVA)
		 *  		IF TURE	 ==> Deployment Descriptor come first. (XML)
		 *  	- 3rd Parameter = final parameter is a vararg (URL PATTERNs OR SERVLET NAMEs)
		 */	
	}

}
