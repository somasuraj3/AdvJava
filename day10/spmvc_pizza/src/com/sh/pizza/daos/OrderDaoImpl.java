package com.sh.pizza.daos;
import com.sh.pizza.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertOrder(Order order) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(order);
	}

	public void updateOrder(Order order) {
		Session session = sessionFactory.getCurrentSession();
		session.update(order);
	}

	public Order getOrder(int id) {
		Session session = sessionFactory.getCurrentSession();
		Order ord = (Order) session.get(Order.class, id);
		return ord;
	}
}
