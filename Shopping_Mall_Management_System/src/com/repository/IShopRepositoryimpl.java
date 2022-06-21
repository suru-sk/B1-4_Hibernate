package com.repository;

import javax.persistence.EntityManager;

import com.entity.Shop;

public abstract class IShopRepositoryimpl implements IShopRepository {
	private EntityManager entityManager;
	
	public IShopRepositoryimpl() {
			
			entityManager = JPAUtil.getEntityManager();
		}
	//private Shop shop;
	@Override
	public Shop addShop(Shop shop) {
		// TODO Auto-generated method stub
		entityManager.persist(shop);
		return shop;
	}
	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}
	public Shop searchShopById(int id) {
		// TODO Auto-generated meth0od stub
		Shop shop = entityManager.find(Shop.class,id);
		return shop;
	}
	@Override
	public Shop deleteShop(Shop shop) {
		// TODO Auto-generated method stub
		return shop;
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