package com.sh.pizza.services;
import com.sh.pizza.entities.*;
public interface OrderService {
	public void addOrder(Order order);
	public void modifyOrder(Order order);
	public Order fetchOrder(int id); 
}
