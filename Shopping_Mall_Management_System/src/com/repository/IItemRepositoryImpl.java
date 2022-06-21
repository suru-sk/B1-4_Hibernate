package com.repository;

import javax.persistence.EntityManager;

import com.entity.Item;

public class IItemRepositoryImpl implements IItemRepository {
	private EntityManager entityManager;
	//@SuppressWarnings("unused")
	private Item item;
		public IItemRepositoryImpl() {
			entityManager = JPAUtil.getEntityManager();
			
}
		@Override
		public Item addItem(Item item) {
			// TODO Auto-generated method stub
			entityManager.persist(item);
			return item;
		}
		@Override
		public Item updateItem(Item item) {
			// TODO Auto-generated method stub
			entityManager.merge(item);
			return item;
		}
		@Override
		public Item searchItem(long id) {
			// TODO Auto-generated method stub
			Item item = entityManager.find(Item.class,id);
			return item;
		}
		@Override
		public Item deleteItem(long id) {
			// TODO Auto-generated method stub
			return item;
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
		@Override
		public Item searchItem(int id) {
			// TODO Auto-generated method stub
			Item item = entityManager.find(Item.class,id);
			return item;
		}
		@Override
		public Item deleteItem(int id) {
			// TODO Auto-generated method stub
			return item;
		}
}
