package com.repository;

import javax.persistence.EntityManager;

import com.entity.Customer;

public class ICustomerRepositoryImpl implements ICustomerRepository 
{
	private EntityManager entityManager;
	private Customer customer;
		public void IOrderRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public Customer addCustomer(Customer customer) {
			// TODO Auto-generated method stub
			entityManager.persist(customer);
			return customer;
		}
		@Override
		public Customer updateCustomer(Customer customer) {
			// TODO Auto-generated method stub
			entityManager.merge(customer);
			return customer;
		}
		@Override
		public Customer searchCustomer(int id) {
			// TODO Auto-ge0nerated method stub
			Customer customer = entityManager.find(Customer.class,id);
			return customer;
		}
		@Override
		public Customer deleteCustomer(int id) {
			// TODO Auto-generated method stub
			return customer;
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
