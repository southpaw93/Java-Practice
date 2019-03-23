package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fdmgroup.food.Dish;

@Entity
@Table (name="FoodOrders")
public class Order {
	@Column(name="tableID")
	private String tableId;
	@Id
	private String orderID;
	@Column(name="orderStatus")
	private String orderStatus;
	@Column(name="totalPrice")
	private double totalPrice;
	@Column(name="orderListPrint")
	private String orderListPrint;
	
//	@ElementCollection(targetClass=String.class)
	
	
	
	private static List<Dish> orderList = new ArrayList<Dish>();
	
	public Order() {
		//create orderID
		String str = java.time.LocalDateTime.now().toString();
		str = str.replaceAll("[^\\d.]", "");
		orderID= str;
	}
	
	public String getOrderID() {
		return orderID;
	}

//	public void setOrderID(int orderID) {
//		this.orderID = orderID;
//	}

	public double getTotalPrice() {
		return totalPrice;
		
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Dish> getOrderList() {
		return orderList;
	}
	public void setOrder(List<Dish> tempOrderList, String tableId) {
		this.orderList = tempOrderList;
		this.tableId = tableId;
		orderStatus = "Pending";
		int i=0;
		double tempPrice = 0;
		for (i=0;i<tempOrderList.size();i++){
			tempPrice = tempPrice + tempOrderList.get(i).getDishPrice();
		}
		setTotalPrice(tempPrice);
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String string) {
		this.tableId = string;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setOrderList(List<Dish> orderList) {
		this.orderList = orderList;
		setOrderListPrint();
		int i=0;
		double tempPrice = 0;
		for (i=0;i<orderList.size();i++){
			tempPrice = tempPrice + orderList.get(i).getDishPrice();
		}
		setTotalPrice(tempPrice);
		
	}
	
	public String toString() {
		return "OrderID: " + orderID + " Table Number: " + tableId + " Order Status: " + orderStatus + " Dishes ordered: " + orderList + orderListPrint;
		}

	public String getOrderListPrint() {
		return orderListPrint;
	}

	public void setOrderListPrint() {
		String temp="";
		int i=0;
		for (i=0; i<orderList.size(); i++){
			temp = temp + "," + orderList.get(i).getDishName();
		}
		orderListPrint = temp;
	}
	
	
}
