package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.Order;
import com.fdmgroup.controllers.writeOrders;
import com.fdmgroup.food.Dish;
import com.fdmgroup.food.Menu;

public class AddOrder extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 934448583105653995L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		writeOrders writeOrder = new writeOrders();
		
		Order order=new Order(); //c8 new order, creating orderid
		order.setTableId(req.getParameter("tableid")); //set table id
		order.setOrderStatus("pending"); //set order status
		
		String[] testingString = req.getParameterValues("select2");
	//	String[] testingString = (String[]) session.getAttribute("select2");
		
		
		
		
		int i=0;
		int j=0;
		Menu menu = new Menu();
		List<Dish> menuDish = menu.getMenuItems();
		List<Dish> toSetDishList = new ArrayList<Dish>();
		for (i=0; i< testingString.length; i++){
			System.out.println(testingString[i]);
			for (j=0; j< menuDish.size(); j++){
				if (menuDish.get(j).getDishName().equals(testingString[i]) ){
					toSetDishList.add(menuDish.get(j));
					System.out.println("gotten item");
				}
			}
		}
		order.setOrderList(toSetDishList);
		writeOrder.addOrder(order);
		
		session.setAttribute("order", order);
		// req.setAttribute("order", order);
		RequestDispatcher reqDisp = req.getRequestDispatcher("./WEB-INF/orderSent.jsp");
		reqDisp.forward(req, resp);
	}
}
