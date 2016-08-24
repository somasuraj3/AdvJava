package com.sh.hb.pizza;

import java.util.List;

public interface MenuDao {
	public List<String> getTypes();
	public List<String> getCategories(String type);
	public List<Item> getItems(String type, String category);
}

