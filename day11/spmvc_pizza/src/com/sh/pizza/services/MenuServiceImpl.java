package com.sh.pizza.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.pizza.daos.MenuDao;
import com.sh.pizza.entities.Item;
import com.sh.pizza.entities.Price;

@Transactional
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;
	@Override
	public List<String> fetchTypes() {
		return menuDao.getTypes();
	}

	@Override
	public List<String> fetchCategories(String type) {
		return menuDao.getCategories(type);
	}

	@Override
	public List<Item> fetchItems(String type, String category) {
		return menuDao.getItems(type, category);
	}

	@Override
	public Item fetchItem(int id) {
		return menuDao.getItem(id);
	}
	
	@Override
	public Price fetchPrice(int id) {
		return menuDao.getPrice(id);
	}
}
