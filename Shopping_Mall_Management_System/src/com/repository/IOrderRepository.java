package com.repository;

import javax.persistence.criteria.Order;

public interface IOrderRepository  
{
	abstract Order addOrder (Order order);
	abstract Order updateOrder(Order order);
	abstract Order searchOrder(int id);
	abstract Order deleteOrder(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}