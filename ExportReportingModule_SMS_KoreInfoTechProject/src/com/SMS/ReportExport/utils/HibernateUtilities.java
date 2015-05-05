package com.SMS.ReportExport.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}
		return sessionFactory;
		
	}
	
	public static Session getCurrentSession(){
		return getSessionFactory().getCurrentSession();
		
	}
	
	public static Session openSession(){
		return getSessionFactory().openSession();
		
	}
	
	public static void closeSession(Session session){
		if(session.isOpen()){
			session.close();
		}
	}

}
