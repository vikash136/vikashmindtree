package com.mindtree.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;
import com.mindtree.utilites.Dbutility;

public class EmployeeDaoImpl implements EmployeeDao
{

	public void saveEmployee(Employee employee)  
	{
		Transaction transaction=null;
		
		Session session=Dbutility.getSessionFactory().openSession();
		transaction= session.beginTransaction(); 
		session.save(employee);
		transaction.commit();
		
		
	}
	
	public List<Employee> getEmployee()
	{
		Session session=Dbutility.getSessionFactory().openSession();
		return session.createQuery("from Employee",Employee.class).list();
		
	}
	
	public  void updateEmployee(int employeeId1, String new_name)
	{
		Transaction transaction=null;
		Session session=Dbutility.getSessionFactory().openSession();
		transaction= session.beginTransaction(); 
		Employee emp=(Employee)session.get(Employee.class,employeeId1);
		emp.setEmployeeName(new_name);
		session.save(emp);
		transaction.commit();
		
		
		
		
	}
	
	


}
