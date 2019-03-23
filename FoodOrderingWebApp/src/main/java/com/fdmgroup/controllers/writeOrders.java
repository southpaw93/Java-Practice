package com.fdmgroup.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.Order;

public class writeOrders {
	private EntityManagerFactory myEmf = Persistence.createEntityManagerFactory("foodshop");
	
//	public writeOrders(EntityManagerFactory emf){
//		myEmf = emf;
//	}
	
	public void addOrder(Order order){
		EntityManager em = myEmf.createEntityManager();
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		em.close();
	}
	
//	public void removeOrder(String orderID) {
//		Order toRemove;
//		EntityManager em = myEmf.createEntityManager();
//		readOrders ro = new readOrders();
//		// toRemove = ro.getOrder(orderID);
//		em.getTransaction().begin();
//		em.remove(ro.getOrder(orderID));
//		em.close();
//	}
	
	public void updateOrder(String orderID, String status){
		Order toUpdate;
		readOrders ro = new readOrders();
		toUpdate = ro.getOrder(orderID);
		if (toUpdate!= null){
		toUpdate.setOrderStatus(status);
		EntityManager em = myEmf.createEntityManager();
		em.getTransaction().begin();
		em.merge(toUpdate);
		em.getTransaction().commit();
		em.close();
		System.out.println("updated");} else { System.out.println("order not found"); }
	}
	
	
}
