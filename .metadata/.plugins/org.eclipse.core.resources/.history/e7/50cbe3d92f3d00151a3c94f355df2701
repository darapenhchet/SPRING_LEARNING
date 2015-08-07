package com.penhchet.shopping.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "nonAsyncServlet",
		urlPatterns = "/regular"
		)
public class NonAsyncServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ENTERING NonAsyncServlet.doGet().");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/view/nonAsync.jsp");
		dispatcher.forward(request, response);
		System.out.println("LEAVING NonAsyncServlet.doGet().");
	}
}
