package com.service;

import javax.persistence.criteria.Order;

import com.entity.Item;

public interface IOrderService 
	{
		abstract Order addOrder(Order order);
		abstract Order updateOrder(Order Order);
		abstract Order searchOrder(long id);
		abstract boolean cancelMall(long id);
		abstract Item addItem(Item item);
	}
