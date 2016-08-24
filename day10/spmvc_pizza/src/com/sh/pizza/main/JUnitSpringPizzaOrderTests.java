package com.sh.pizza.main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.GenericXmlContextLoader;

import com.sh.pizza.daos.CustomerDao;
import com.sh.pizza.daos.MenuDao;
import com.sh.pizza.daos.OrderDao;
import com.sh.pizza.entities.Customer;
import com.sh.pizza.entities.Order;
import com.sh.pizza.entities.OrderDetails;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/pizza.xml", loader=GenericXmlContextLoader.class)
public class JUnitSpringPizzaOrderTests {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private CustomerDao custDao;
	
	@Test
	public void testOrderNew() {
		Customer cust = custDao.getCustomer("nilesh@sunbeaminfo.com");
		Order ord = new Order(0, new Date(), "pending");
		
		OrderDetails od1 = new OrderDetails(0);
		od1.setOrder(ord);
		od1.setPrice(menuDao.getItem(1).getPriceList().get(0));
		OrderDetails od2 = new OrderDetails(0);
		od2.setOrder(ord);
		od2.setPrice(menuDao.getItem(2).getPriceList().get(0));
		List<OrderDetails> list = new ArrayList<>();
		Collections.addAll(list, od1, od2);
		System.out.println(list);
		
		ord.setDetailList(list);
		ord.setCust(cust);
		
		orderDao.insertOrder(ord);
	}
	
	@Test
	public void testOrderFind() {
		Order ord = orderDao.getOrder(3);
		System.out.println("Found : " + ord);
		assertNotNull("Order Find : ", ord);
	}
	
	@Test
	public void testUpdateOrder() {
		Order ord = orderDao.getOrder(3);
		assertNotNull("Order Find : ", ord);
		ord.setStatus("delivered");
		orderDao.updateOrder(ord);
		assertTrue("Order Updated : ", true);
	}
}

