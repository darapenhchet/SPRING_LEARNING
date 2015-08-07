package com.penhchet.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servletThree", urlPatterns = "/servletThree") 
public class ServletThree extends HttpServlet {    
	@Override    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
			System.out.println("Entering ServletThree.doGet()");        
			response.getWriter().write("Servlet Three");        
			System.out.println("Leaving ServletThree.doGet()");    
	}
}