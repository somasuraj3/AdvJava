package com.sh.pizza.daos;
import com.sh.pizza.entities.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public Customer getCustomer(String email) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(Customer.class);
		cr.add(Restrictions.eq("email", email));
		Customer cust = (Customer) cr.uniqueResult();
		return cust;
	}

	public void insertCustomer(Customer cust) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cust);
	}
}

