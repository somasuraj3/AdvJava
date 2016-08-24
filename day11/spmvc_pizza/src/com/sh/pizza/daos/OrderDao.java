package com.sh.pizza.daos;
import com.sh.pizza.entities.*;
public interface OrderDao {
	public void insertOrder(Order order);
	public void updateOrder(Order order);
	public Order getOrder(int id); 
}
