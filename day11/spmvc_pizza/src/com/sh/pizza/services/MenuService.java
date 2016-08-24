package com.sh.pizza.services;

import java.util.List;
import com.sh.pizza.entities.*;
public interface MenuService {
	public List<String> fetchTypes();
	public List<String> fetchCategories(String type);
	public List<Item> fetchItems(String type, String category);
	public Item fetchItem(int id);	
	public Price fetchPrice(int id);	
}

