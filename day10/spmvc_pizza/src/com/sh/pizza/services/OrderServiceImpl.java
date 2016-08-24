package com.sh.pizza.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.pizza.daos.OrderDao;
import com.sh.pizza.entities.Order;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void addOrder(Order order) {
		orderDao.insertOrder(order);
	}

	@Override
	public void modifyOrder(Order order) {
		orderDao.updateOrder(order);
	}

	@Override
	public Order fetchOrder(int id) {
		return orderDao.getOrder(id);
	}
}
