package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.Order;
import com.fdmgroup.controllers.readOrders;

public class ViewOrder extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4351934069618915879L;
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession();
		//get list from sql
		readOrders ro = new readOrders();
		List<Order> allOrders = ro.getAllOrders();
		System.out.println(allOrders);
		//pass to and display in view orderpage
		
		session.setAttribute("allOrders", allOrders);
		RequestDispatcher reqDisp = req.getRequestDispatcher("./WEB-INF/viewOrder.jsp");
		reqDisp.forward(req, resp);
	}
}
