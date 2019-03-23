package com.fdmgroup.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOut extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6682060355414573058L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher reqDisp = req.getRequestDispatcher("./index.jsp");
		reqDisp.forward(req, resp);
	}
}
