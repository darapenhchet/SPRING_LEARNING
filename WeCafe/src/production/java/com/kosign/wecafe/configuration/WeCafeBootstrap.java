package com.kosign.wecafe.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class WeCafeBootstrap implements WebApplicationInitializer{
	@Override
	public void onStartup(ServletContext container)
			throws ServletException {
	
		container.getServletRegistration("default").addMapping("/resources/*", "*.css", "*.js", "*.png", "*.gif", "*.jpg");
		 
		 AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		 rootContext.register(RootContextConfiguration.class);
		 container.addListener(new ContextLoaderListener(rootContext));
		 
		 AnnotationConfigWebApplicationContext servletContext = new AnnotationConfigWebApplicationContext();
		 servletContext.register(ServletContextConfiguration.class);
		 ServletRegistration.Dynamic dispatcher = container.addServlet("springDispatcher", 
				 new DispatcherServlet(servletContext));
		 			
		 dispatcher.addMapping("/");
		
/*		container.getServletRegistration("default").addMapping("/resource/*");
		
		XmlWebApplicationContext rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/rootContext.xml");		
		container.addListener(new ContextLoaderListener(rootContext));
		
		XmlWebApplicationContext servletContext = new XmlWebApplicationContext();
		servletContext.setConfigLocation("/WEB-INF/servletContext.xml");
		ServletRegistration.Dynamic dispatcher = container.addServlet("springDispatcher",
				new DispatcherServlet(servletContext));
		dispatcher.addMapping("/");*/
	}
}
