package com.accolite.hibernate.dao;

import java.util.List;

import com.accolite.hibernate.model.Employee;

public interface EmployeeDao {
	public boolean save(Employee E);
	public List<Employee> getAllEmployee();
	public boolean delete(int employeeID);
	public boolean update(Employee E);
	public Employee findByID(int employeeID);
}
