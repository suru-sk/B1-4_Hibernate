package com.service;

import com.entity.Employee;
import com.entity.Item;
import com.entity.Shop;
import com.repository.IShopRepository;
import com.repository.IShopRepositoryimpl;

public abstract class IShopServiceimpl implements IShopService
{
	//Establishing connection between Service and Repository
	private IShopRepository dao4;	
	public IShopServiceimpl()
	{
		dao4 = new IShopRepositoryimpl();
	}
	@Override
	public Shop addShop(Shop shop) {
		dao4.beginTransaction();
		dao4.addShop(shop);
		dao4.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao4.beginTransaction();
		dao4.updateShop(shop);
		dao4.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao4.searchShopById(id);
		return shop;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		dao4.beginTransaction();
		((IShopServiceimpl) dao4).addEmployee(employee);
		dao4.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao4.beginTransaction();
		((IShopServiceimpl) dao4).updateEmployee(employee);
		dao4.commitTransaction();
		return employee;
	}

	@Override
	public boolean deleteShop(int id) {
		dao4.beginTransaction();
		dao4.deleteShop(id);
		dao4.commitTransaction();
		return false;
	}

	
	public Item addItem(Item item) {
		dao4.beginTransaction();
		((IShopServiceimpl) dao4).addItem(item);
		dao4.commitTransaction();
		return item;
	}

}