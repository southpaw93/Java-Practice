package com.fdmgroup.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1190113843519291836L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		if (req.getParameter("password").equals("123")){
			RequestDispatcher reqDisp = req.getRequestDispatcher("./WEB-INF/adminPage.jsp");
			reqDisp.forward(req, resp);
		} else {
			RequestDispatcher reqDisp = req.getRequestDispatcher("./index.jsp");
			reqDisp.forward(req, resp);
		}
	}
}
