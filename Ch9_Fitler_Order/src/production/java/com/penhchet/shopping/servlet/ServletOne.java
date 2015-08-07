package com.penhchet.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servletOne", urlPatterns = "/servletOne") 
public class ServletOne extends HttpServlet {    
	@Override    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
			System.out.println("Entering ServletOne.doGet()");        
			response.getWriter().write("Servlet One");        
			System.out.println("Leaving ServletOne.doGet()");    
	}
}