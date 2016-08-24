package com.sh.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HbCacheMain {
	public static void main(String[] args) {
		SessionFactory factory = HbUtil.getSessionFactory();
		
		Session session1 = factory.openSession();
		Book b1 = (Book) session1.get(Book.class, 11);
		System.out.println(b1);
		session1.close();

		// method 1
		Session session2 = factory.openSession();
		
		// method 2
		Session session = factory.getCurrentSession();
		Book b2 = (Book) session.get(Book.class, 11);
		System.out.println(b2);
		
		session2.close();
		
		factory.close();
	}
}
