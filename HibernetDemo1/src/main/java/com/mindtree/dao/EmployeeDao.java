package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeDao 
{
	void saveEmployee(Employee employee) ;
	
	List<Employee> getEmployee();
	
	void updateEmployee(int id, String new_name);

}
