package com.sh.pizza;

import java.util.ArrayList;
import java.util.List;

public class MenuBean {
	private String type;
	private String category;
	private List<String> typeList;
	private List<String> categoryList;
	private List<Item> itemList;
	public MenuBean() {
		this.type = "";
		this.category = "";
		this.typeList = new ArrayList<>();
		this.categoryList = new ArrayList<>();
		this.itemList = new ArrayList<>();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
	public List<String> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return String.format("MenuBean [type=%s, category=%s, typeList=%s, categoryList=%s, itemList=%s]", type,
				category, typeList, categoryList, itemList);
	}
	public void fetchTypes() {
		PizzaMenuDao dao = new PizzaMenuDao();
		try {
			dao.open();
			typeList = dao.getTypes();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
	}
	public void fetchCategories() {
		PizzaMenuDao dao = new PizzaMenuDao();
		try {
			dao.open();
			categoryList = dao.getCategories(this.type);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}		
	}
	public void fetchItems() {
		PizzaMenuDao dao = new PizzaMenuDao();
		try {
			dao.open();
			itemList = dao.getItems(this.type, this.category);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
	}
}
