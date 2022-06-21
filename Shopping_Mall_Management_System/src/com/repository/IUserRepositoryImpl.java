package com.repository;

import javax.persistence.EntityManager;

import com.entity.User;

public class IUserRepositoryImpl implements IUserRepository 
{
	private EntityManager entityManager;
	private User user;
		public void IOrderRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public User addNewUser(User user) {
			// TODO Auto-generated method stub
			entityManager.persist(user);
			return user;
		}
		@Override
		public User updateUser(User user) {
			// TODO Auto-generated method stub
			entityManager.merge(user);
			return user;
		}
		@Override
		public User deleteUser(int id) {
			// TODO Auto-generated method stub
			return user;
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
