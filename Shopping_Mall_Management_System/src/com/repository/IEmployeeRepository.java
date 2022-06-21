package com.repository;

import com.entity.Employee;

public interface IEmployeeRepository  
{
	abstract Employee addEmployee (Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(int id);
	abstract boolean deleteEmployee(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}	