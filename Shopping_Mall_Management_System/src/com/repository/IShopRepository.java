package com.repository;

import com.entity.Shop;

public interface IShopRepository  {
	abstract Shop addShop (Shop shop);
	//abstract Shop updateShop(int i);
	abstract Shop searchShopById(int i);
	abstract Shop deleteShop(Shop shop );
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	Shop updateShop(Shop shop);
	abstract Shop updateShop(int i);
	abstract void deleteShop(int i);
	abstract Shop addEmployee(Shop shop);
}
	
	