package com.penhchet.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {    
	@Override    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
			System.out.println("Entering MyServlet.doGet()");        
			response.getWriter().write("MyServlet");        
			System.out.println("Leaving MyServlet.doGet()");    
	}
}