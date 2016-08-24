package com.sh.hbtemp;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
	private HibernateTemplate hbTemplate;
	
	public List<Book> getAllBooks() {
		return (List<Book>) hbTemplate.find("from Book b");
	}
	
	public List<Book> getSubjectBooks(String subject) {
		DetachedCriteria cr = DetachedCriteria.forClass(Book.class);
		cr.add(Restrictions.eq("subject", subject));
		return (List<Book>) hbTemplate.findByCriteria(cr);
	}

	@Transactional
	public void addBook(Book b) {
		hbTemplate.persist(b);
		//hbTemplate.save(b);
	}
}

