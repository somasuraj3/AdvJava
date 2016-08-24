package com.sh.hb;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class BookDao {
	private Session session;
	public void open() {
		session = HbUtil.getSessionFactory().openSession();
	}
	public void close() {
		if(session!=null)
			session.close();
	}
	public Book find(int id) {
		Book b = (Book) session.get(Book.class, id);
		//Book b = (Book) session.load(Book.class, id);
		return b;
	}
	public void insert(Book b) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(b);
			//session.flush();
			tx.commit();
		} catch(Exception ex) {
			tx.rollback();
		}
	}
	public void update(Book b) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(b);
			tx.commit();
		} catch(Exception ex) {
			tx.rollback();
		}
	}
	public void delete(int id) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Book b = (Book) session.get(Book.class, id);
			session.delete(b);
			tx.commit();
		} catch(Exception ex) {
			tx.rollback();
		}
	}
	
	public List<Book> getAll() {
		Criteria cr = session.createCriteria(Book.class);
		cr.addOrder(Order.desc("price"));
		return cr.list();
	}
	
	public List<Book> getBooksOfSubject(String subj) {
		Criteria cr = session.createCriteria(Book.class);
		cr.add(Restrictions.eq("subject", subj));
		return cr.list();
	}
	

	public List<Book> getBooksOfSubjectAuthor(String subj, String auth) {
		Criteria cr = session.createCriteria(Book.class);
		cr.add(Restrictions.eq("subject", subj));
		cr.add(Restrictions.eq("author", auth));
		return cr.list();
	}
	
	public List<String> getSubjects() {
		String sql = "SELECT DISTINCT SUBJECT FROM BOOKS";
		SQLQuery q = session.createSQLQuery(sql);
		return q.list();
	}
	
	public List<Book> getBooksOfPriceLT(double price) {
		String hql = "FROM Book b where b.price < :p_price"; //param query
		Query q = session.createQuery(hql);
		q.setParameter("p_price", price);
		return q.list();
	}
	public List<Book> getBooksOfPriceGT(double price) {
		Query q = session.getNamedQuery("BooksPriceGT");
		q.setParameter("p_price", price);
		return q.list();
	}
	
	public List<Book> getBooksFromSP(double price) {
		Query q = session.getNamedQuery("BooksSP");
		q.setParameter("p_price", price);
		return q.list();
		// q.executeUpdate() in case SP is not returning multiple results
		// q.uniqueResult() in case SP returning single object.
	}
}





