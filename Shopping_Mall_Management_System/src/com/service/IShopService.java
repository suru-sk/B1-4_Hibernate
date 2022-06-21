package com.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.entity.Shop;

public interface IShopService<Employee> 
	{
		abstract Shop addShop(Shop shop);
		//@SuppressWarnings("rawtypes")
		abstract Shop updateShop(Shop shop);
		//@SuppressWarnings("rawtypes")
		abstract Shop searchShopById(int ID);
		abstract Boolean addEmployee(Employee employee);
		abstract Boolean updateEmployee(Employee employee);
		abstract Boolean deleteEmployee(long id);
		abstract Item addItem(Item item);
		boolean deleteShop(int id);
		com.entity.Employee updateEmployee(com.entity.Employee employee);
		com.entity.Employee addEmployee(com.entity.Employee employee);
		com.entity.Item addItem(com.entity.Item item);
	}

