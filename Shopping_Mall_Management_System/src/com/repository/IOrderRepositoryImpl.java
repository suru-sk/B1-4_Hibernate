package com.repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Order;

public class IOrderRepositoryImpl implements IOrderRepository 
{
	private EntityManager entityManager;
	private Order order;
		public void IOrderRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public Order addOrder(Order order) {
			// TODO Auto-generated method stub
			entityManager.persist(order);
			return order;
		}
		@Override
		public Order updateOrder(Order order) {
			// TODO Auto-generated method stub
			entityManager.merge(order);
			return order;
		}
		@Override
		public Order searchOrder(int id) {
			// TODO Auto-generated method stub
			Order order=entityManager.find(Order.class, id);
			return order;
		}
		@Override
		public Order deleteOrder(int id) {
			// TODO Auto-generated method stub
			return order;
		}
		@Override
		public void commitTransaction() {
			// TODO Auto-generated method stub
			entityManager.getTransaction().commit();
			
		}
		@Override
		public void beginTransaction() {
			// TODO Auto-generated method stub
			entityManager.getTransaction().begin();
		}
}