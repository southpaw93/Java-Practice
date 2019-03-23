package com.fdmgroup.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.fdmgroup.Order;

public class readOrders {
	private EntityManagerFactory myEmf = Persistence.createEntityManagerFactory("foodshop");
	
//	public readOrders(EntityManagerFactory emf){
//		myEmf = emf;
//	}
//	
	public List<Order> getAllOrders() {
		EntityManager em = myEmf.createEntityManager();
		TypedQuery<Order> query = em.createQuery("SELECT b from Order b", Order.class);
		List<Order> allOrders = query.getResultList();
		return allOrders;
	}
	public Order getOrder(String orderID){
		EntityManager em = myEmf.createEntityManager();
		Order foundOrder = em.find(Order.class, orderID);
		em.close();
		
		return foundOrder;
	}
}
