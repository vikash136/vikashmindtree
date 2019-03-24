package com.mindtree.utilites;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dbutility 
{
	private static SessionFactory sf;
	
	
	public static SessionFactory getSessionFactory() 
	{
		sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(com.mindtree.entity.Employee.class).buildSessionFactory();
		return sf;
	}

}
