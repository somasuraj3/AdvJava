package com.bkshop.daos;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bkshop.models.Book;

@Repository
@Transactional
public class BookDao {
	@Autowired
	public SessionFactory hbSF;
	
	public List<String> selectSubjects() {
		org.hibernate.Session hbSession = hbSF.getCurrentSession();
		SQLQuery q = hbSession.createSQLQuery("select distinct subject from BOOKS");
		return q.list();
	}

	public List<Book> selectSubjectBooks(String subject) {
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Book b where b.subject=?");
		q.setString(0, subject);
		return q.list();
	}

	public Book selectBook(int id) {
		Session hbSession = hbSF.getCurrentSession();
		Book b = (Book) hbSession.get(Book.class, id);
		return b;
	}
	
	public void insertBook(Book b) {
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(b);
		hbSession.flush();
	}
	public void updateBook(Book bk) {
		Session hbSession = hbSF.getCurrentSession();
		hbSession.saveOrUpdate(bk);
		hbSession.flush();
	}
}

