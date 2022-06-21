package com.repository;

import javax.persistence.EntityManager;

import com.entity.Employee;

public class IEmployeeRepositoryimpl implements IEmployeeRepository {
	private EntityManager entityManager;
	private boolean employee;
		public IEmployeeRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public Employee addEmployee(Employee employee) {
			// TODO Auto-generated method stub
			entityManager.persist(employee);
			return employee;
		}
		@Override
		public Employee updateEmployee(Employee employee) {
			// TODO Auto-generated method stub
			entityManager.persist(employee);
			return employee;
		}
		@Override
		public Employee searchEmployee(int id) {
			// TODO Auto-generated method stub
			Employee employee = entityManager.find(Employee.class, id);
			return employee;
		}
		@Override
		public boolean deleteEmployee(int id) {
			// TODO Auto-generated method stub
			return employee;
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
		