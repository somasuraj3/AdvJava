package com.sh.pizza.daos;

import java.util.List;
import com.sh.pizza.entities.*;
public interface MenuDao {
	public List<String> getTypes();
	public List<String> getCategories(String type);
	public List<Item> getItems(String type, String category);
	public Item getItem(int id);	
}

