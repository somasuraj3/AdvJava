package com.sh.pizza.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sh.pizza.daos.CustomerDao;
import com.sh.pizza.entities.Customer;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao custDao;
	@Transactional
	public void addCustomer(Customer cust) {
		custDao.insertCustomer(cust);
	}
	@Transactional(propagation=Propagation.NEVER)
	public Customer findCustomer(String email) {
		return custDao.getCustomer(email);
	}
	@Transactional(propagation=Propagation.NEVER)
	public boolean validateCustomer(String email, String password) {
		Customer cust = this.findCustomer(email);
		if(cust!=null && cust.getPassword().equals(password))
			return true;
		return false;
	}
}
