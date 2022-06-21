package com.repository;

import com.entity.Customer;

public interface ICustomerRepository {
	abstract Customer addCustomer (Customer customer);
	abstract Customer updateCustomer(Customer customer);
	abstract Customer searchCustomer(int id);
	abstract Customer deleteCustomer(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

