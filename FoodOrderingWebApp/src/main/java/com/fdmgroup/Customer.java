package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.food.Dish;
import com.fdmgroup.food.Menu;

public class Customer {
	
	private Menu menu = new Menu();
	private String tableId;
	Order custOrder = new Order();
	List<Dish> tempOrderList = new ArrayList<Dish>();
	
	public Customer(String id) {
		this.tableId = id;
	}
	
	
	public void addItem(Dish dish) {
		tempOrderList.add(dish);
	}
	
	public void removeItem(Dish dish) {
		if (tempOrderList.contains(dish) ) {
			tempOrderList.remove(dish);
		}
	}
	
	public void clearAllItems() {
		tempOrderList.clear();
	}
	
	public void sendOrder() {
		custOrder.setOrder(tempOrderList, tableId);
	}
}
