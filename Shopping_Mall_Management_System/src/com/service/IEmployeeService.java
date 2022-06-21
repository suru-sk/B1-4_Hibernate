package com.service;

import com.entity.Employee;

public interface IEmployeeService  
{
	abstract Employee addEmployee (Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(long id);
	abstract boolean deleteEmployee(long id);
}	