package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.fdmgroup.controllers.readOrders;
import com.fdmgroup.controllers.writeOrders;
import com.fdmgroup.food.Dish;
import com.fdmgroup.food.Menu;

public class Main {

	public static void main(String[] args) {
		//instiantiate a kitchen
		//instantiate customer with id as constructor
		
		// EntityManagerFactory myEmf;
		
		writeOrders wo = new writeOrders();
		readOrders ro = new readOrders();
//		Order testOrder = new Order();
//		testOrder.setTableId("17");
//		testOrder.setOrderStatus("pending");
//		Menu testMenu = new Menu();
//		List<Dish> testList = new ArrayList<Dish>();
//		testList = testMenu.getMenuItems();
//		testOrder.setOrderList(testList);
//		wo.addOrder(testOrder);
		
	//	wo.removeOrder("20181001182645.221");
		
	//	readOrders ro = new readOrders();
		
	//	wo.updateOrder("20181001182645.221", "cooking");
		
	//	wo.removeOrder("20181001182645.221");
		
		
	//	List<Order> testlist = ro.getAllOrders();
	//	System.out.println(testlist);
	}

}
