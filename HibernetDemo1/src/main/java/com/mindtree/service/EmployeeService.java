package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeService 
{
	
	void saveEmployee(Employee employee);
	List<Employee> getEmployee();
	
	void updateEmployee(int employeeId1, String new_name);

}
