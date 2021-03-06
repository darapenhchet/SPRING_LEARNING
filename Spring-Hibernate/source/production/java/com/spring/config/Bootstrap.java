package com.spring.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SuppressWarnings("unused")
public class Bootstrap implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		container.getServletRegistration("default").addMapping("/resource/*");

		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootContextConfiguration.class);
		container.addListener(new ContextLoaderListener(rootContext));

		AnnotationConfigWebApplicationContext servletContext = new AnnotationConfigWebApplicationContext();
		servletContext.register(ServletContextConfiguration.class);
		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"springDispatcher", new DispatcherServlet(servletContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.setMultipartConfig(new MultipartConfigElement(null, 20_971_520L, 41_943_040L, 512_00));
		dispatcher.addMapping("/");

/*		XmlWebApplicationContext rootContext = new XmlWebApplicationContext();

		rootContext.setConfigLocation("/WEB-INF/rootContext.xml");

		container.addListener(new ContextLoaderListener(rootContext));

		XmlWebApplicationContext servletContext = new XmlWebApplicationContext();

		servletContext.setConfigLocation("/WEB-INF/servletContext.xml");

		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"springDispatcher", new DispatcherServlet(servletContext));

		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");*/

	}

}
