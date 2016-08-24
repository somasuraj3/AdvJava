package com.sh.pizza.services;

import com.sh.pizza.entities.Customer;

public interface CustomerService {
	public void addCustomer(Customer cust);
	public Customer findCustomer(String email);
	public boolean validateCustomer(String email, String password);
}
