package com.client;

import com.entity.Shop;
import com.repository.IShopRepository;
import com.repository.IShopRepositoryimpl;

public class Client {
public static void main(String[] args) {
		
		Shop shop = new Shop();
		IShopRepository service = new IShopRepositoryimpl();
		
	    shop.setShopID(11);
		shop.setShopName("KGF");
		shop.setShopOwner("Rocky");
		shop.setShopStatus("Open");
		shop.setShopCategory("Gold");
		shop.setLeaseStatus("3Years");
		shop.setCustomers("James");
		service.addShop(shop);
		
		
		
		shop = service.searchShopById(100);
		System.out.println("Id is: "+shop.getShopID());
		System.out.println("name is: "+shop.getShopName());
		System.out.println("shopOwner is: "+shop.getShopOwner());
		System.out.println("shopLease is: "+shop.getLeaseStatus());
		
		shop = service.updateShop(100);
		shop.setShopName("Gold");
		service.updateShop(112);
		System.out.println("Updated successfully");
	
		
		shop= service.searchShopById(100);
		service.deleteShop(100);
		System.out.println("delete is sucessful");
		

	
	}

}
