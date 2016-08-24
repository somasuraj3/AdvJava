package com.sh.pizza.daos;

import com.sh.pizza.entities.*;

public interface CustomerDao {
	public Customer getCustomer(String email);
	public void insertCustomer(Customer cust);
}
