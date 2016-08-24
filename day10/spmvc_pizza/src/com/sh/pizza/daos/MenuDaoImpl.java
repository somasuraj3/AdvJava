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
public class MenuDaoImpl implements MenuDao {
	@Autowired
	private SessionFactory sessionFactory;


	public List<String> getTypes() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT DISTINCT i.type FROM Item i";
		Query q = session.createQuery(hql);
		List<String> list = q.list();
		return list;
	}

	public List<String> getCategories(String type) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT DISTINCT i.category FROM Item i WHERE i.type=:p_type";
		Query q = session.createQuery(hql);
		q.setParameter("p_type", type);
		List<String> list = q.list();
		return list;
	}


	public List<Item> getItems(String type, String category) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(Item.class);
		cr.add(Restrictions.eq("type", type));
		cr.add(Restrictions.eq("category", category));
		List<Item> list = cr.list();
		return list;
	}

	public Item getItem(int id) {
		Session session = sessionFactory.getCurrentSession();
		Item item = (Item) session.get(Item.class, id);
		return item;
	}
	public Price getPrice(int id) {
		Session session = sessionFactory.getCurrentSession();
		Price price = (Price) session.get(Price.class, id);
		return price;
	}
}
