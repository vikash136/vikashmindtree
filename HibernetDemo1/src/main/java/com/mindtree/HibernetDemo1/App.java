package com.mindtree.HibernetDemo1;
import java.util.List;
import java.util.Scanner;

import com.mindtree.entity.Employee;

import com.mindtree.serviceimpl.EmployeeServiceImpl;

public class App 
{
	
 static Scanner sc=new Scanner(System.in);
	
    public static void main( String[] args )
    {    
    	Employee employee=new Employee();
    	
    	EmployeeServiceImpl empserimpl=new EmployeeServiceImpl();
    	
    	System.out.println("Enter the employee id");
    	int employeeId=sc.nextInt();
    	employee.setEmployeeId(employeeId);
    	
    	System.out.println("Enter  the employee name");
    	String employeeName=sc.next();
    	employee.setEmployeeName(employeeName);
    	
    	System.out.println("Enter the employee age");
    	int employeeAge=sc.nextInt();
    	employee.setEmployeeAge(employeeAge);
    	
    	
    	empserimpl.saveEmployee(employee);
    	
    	System.out.println("Enter the id");
    	int employeeId1=sc.nextInt();
    	System.out.println("Enter the new name");
    	String new_name=sc.next();

    	empserimpl.updateEmployee(employeeId1,new_name);
    	
    	
    	
    	
    	
    	//for the consol o/p
//    	List<Employee> employees=empserimpl.getEmployee();
//    	
//    		for (Employee e1 : employees)
//    		{
//    			System.out.println(e1.getEmployeeId()+" "+e1.getEmployeeName()+" "+e1.getEmployeeAge());
//				
//			}
    		sc.close(); 	
          
    }   
}

