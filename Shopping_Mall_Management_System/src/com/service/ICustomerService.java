package com.service;

import java.util.List;

import com.entity.Item;
import com.entity.User;
public interface ICustomerService 
{
	abstract List<Item> searchItem(String itemName);
	abstract Item orderItem(Item item);
	abstract Boolean searchMall(long id);
	abstract Boolean cancelOrder(long orderid);
	abstract User login(User user);
	abstract boolean logOut();

}
