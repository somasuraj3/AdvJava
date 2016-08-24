package com.sh.hb;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hb2Main {
	public static void main(String[] args) {
		SessionFactory factory = HbUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Dept d = (Dept) session.get(Dept.class, 10);
		System.out.println(d);
		for (Emp e:d.getEmpList()) {
			System.out.println(e);
		}
		
		
		/*
		Criteria cr = session.createCriteria(Dept.class);
		List<Dept> list = cr.list();
		for (Dept d : list) {
			System.out.println(d);
			for (Emp e : d.getEmpList()) {
				System.out.println(e);
			}
		}*/
		/*
		int deptno = 50;
		
		Emp e1 = new Emp(1, "ABC", 111, deptno);
		Emp e2 = new Emp(2, "PQR", 222, deptno);
		Emp e3 = new Emp(3, "XYZ", 333, deptno);
		Dept d = new Dept(deptno, "Timepass", "Pune");
		d.getEmpList().add(e1);
		d.getEmpList().add(e2);
		d.getEmpList().add(e3);
		
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(d);
		System.out.println("Dept Inserted : " + id);
		tx.commit();
		*/
		
		/*Transaction tx = session.beginTransaction();
		Dept d = (Dept) session.get(Dept.class, 50);
		if(d!=null) {
			session.delete(d);
			System.out.println("Dept Deleted!!");
		}
		tx.commit();
		session.close();
*/	}
}





