package com.penhchet.shopping.listener;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.penhchet.shopping.filter.AuthenticationFilter;

@WebListener
public class Configrator implements ServletContextListener{

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
		
		ServletContext context = event.getServletContext();
		
		FilterRegistration.Dynamic registration = context.addFilter("authenticationFilter", new AuthenticationFilter());
		
		registration.setAsyncSupported(true);
		
		registration.addMappingForUrlPatterns(null, false, "/dashboard");
	}

}
