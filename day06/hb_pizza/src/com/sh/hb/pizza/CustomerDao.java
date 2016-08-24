package com.sh.hb.pizza;

public interface CustomerDao {
	public Customer findCustomer(String email);
	public void addCustomer(Customer cust);
	public void updateCustomer(Customer cust);
}
