package com.fdmgroup.food;

public class Dish {
	private String dishName;
	private double dishPrice;
	
	public Dish(String dishName, double dishPrice) {
		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String toString(){
		return dishName;
	}
	
}
