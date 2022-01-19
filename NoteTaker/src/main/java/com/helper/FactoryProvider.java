package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	
	public static SessionFactory factory;
	
	//this method will be used to get session factory
	public static SessionFactory getFactory() {
		
		if(factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return factory;
	}
	
	//this method will be used to close session factory
	public static void closeFactory() {
		
		if(factory.isOpen()) {
			factory.close();
		}
	}
	

}
