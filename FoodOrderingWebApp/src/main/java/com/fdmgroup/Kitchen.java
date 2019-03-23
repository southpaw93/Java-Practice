package com.fdmgroup;

import java.util.Queue;

public class Kitchen {
	private Queue<Order> ordersQueue;
	
	public void readFirstOrder() {
		ordersQueue.peek();
	}
	
	public void processFirstOrder() {
		ordersQueue.element().setOrderStatus("Processing");
	}
	
	public void completeOrder() {
		ordersQueue.element().setOrderStatus("Completed");
		ordersQueue.remove();
	}
	
	
}
