package com.sh.hb.pizza;

public interface OrderDao {
	public void insertOrder(Order order);
	public void updateOrder(Order order);
	public Order getOrder(int id); 
}
