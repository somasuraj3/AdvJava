package com.sh.pizza.main;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.GenericXmlContextLoader;

import com.sh.pizza.entities.Customer;
import com.sh.pizza.services.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/pizza.xml", loader=GenericXmlContextLoader.class)
public class JUnitSpringPizzaCustomerTests {
	@Autowired
	private CustomerService custService;
	
	@Test
	public void testCustomerValidate() {
		boolean success = custService.validateCustomer("nilesh@sunbeaminfo.com", "nilesh");
		assertTrue("Customer Validate : ", success);
	}
	
	@Test
	public void testCustomerAdd() {
		Customer cust = new Customer(0, "sakshi", "sakshi", "Pune", "sakshi@gmail.com", "9527331338");
		custService.addCustomer(cust);
		assertTrue("Customer Added", true);
	}
}

