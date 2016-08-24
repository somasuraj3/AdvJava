package com.sh.hb;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HbReln2Main {
	public static void main(String[] args) {
		SessionFactory factory = HbUtil.getSessionFactory();
		Session session = factory.openSession();
		/*
		Emp e = (Emp)session.get(Emp.class, 7369);
		System.out.println(e);
		Dept d = e.getDept();
		System.out.println(d);
		
		for (Emp e1 : d.getEmpList()) {
			System.out.println(e1);
		}
		*/
		Dept d = new Dept(50, "SH", "Pune");
		Emp e = new Emp(1, "Nilesh", 20000, d);
		d.getEmpList().add(e);
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(e);
		System.out.println("Emp Inserted : " + id);
		tx.commit();
		session.close();
	}
}
