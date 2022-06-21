package com.repository;

import javax.persistence.EntityManager;

//import com.entity.Shop;
import com.entity.ShopOwner;

public class IShopOwnerRepositoryimpl implements IShopOwnerRepository
{
	private EntityManager entityManager;
	private ShopOwner shopOwner;
		public void IShopRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public ShopOwner addShopOwner(ShopOwner shopOwner) {
			// TODO Auto-generated method stub
			entityManager.persist(shopOwner);
			return shopOwner;
		}
		@Override
		public ShopOwner updateShopOwner(ShopOwner ShopOwner) {
			// TODO Auto-generated method stub
			entityManager.merge(shopOwner);
			return shopOwner;
		}
		@Override
		public ShopOwner searchShopOwner(int id) {
			// TODO Auto-generated method stub
			ShopOwner shopOwner=entityManager.find(ShopOwner.class, id);
			return shopOwner;
		}
		@Override
		public ShopOwner deleteShopOwner(int id) {
			// TODO Auto-generated method stub
			return shopOwner;
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
	