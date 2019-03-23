package com.fdmgroup.food;

import java.util.ArrayList;

public class Menu {
	ArrayList<Dish> menuItems = new ArrayList<Dish>();
	
	public ArrayList<Dish> getMenuItems() {
		return menuItems;
	}
	
	
	public Menu() {
		
	
	Dish nigiri = new Dish("nigiri", 8.88);
	Dish maki = new Dish("maki", 8.88);
	Dish sashmi = new Dish("sashmi", 8.88);
	Dish uramaki = new Dish("uramaki", 8.88);
	Dish temaki = new Dish("temaki", 8.88);
	
	this.menuItems.add(nigiri);
	this.menuItems.add(maki);
	this.menuItems.add(sashmi);
	this.menuItems.add(uramaki);
	this.menuItems.add(temaki);
	
	}
	
	
}
