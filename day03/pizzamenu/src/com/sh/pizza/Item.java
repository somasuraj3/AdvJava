package com.sh.pizza;

public class Item {
	private int id;
	private String type;
	private String category;
	private String name;
	private String description;
	public Item() {
		this(0, "", "", "", "");
	}
	public Item(int id, String type, String category, String name, String description) {
		this.id = id;
		this.type = type;
		this.category = category;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return String.format("Item [id=%s, type=%s, category=%s, name=%s, description=%s]", id, type, category, name,
				description);
	}
}
