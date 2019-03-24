package com.mindtree.serviceimpl;

import java.util.List;

import com.mindtree.daoImpl.EmployeeDaoImpl;
import com.mindtree.entity.Employee;

import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{

	EmployeeDaoImpl empdaoimpl=new EmployeeDaoImpl();
	
	
	public void saveEmployee(Employee employee)
	{
		empdaoimpl.saveEmployee(employee);
	}
	
	public List<Employee> getEmployee()
	{
		List<Employee>employees=empdaoimpl.getEmployee();
		return employees;
	}
	
	
	
	public void updateEmployee(int employeeId1, String new_name)
	{
		empdaoimpl.updateEmployee(employeeId1,new_name);
	}
	
	
	

}
