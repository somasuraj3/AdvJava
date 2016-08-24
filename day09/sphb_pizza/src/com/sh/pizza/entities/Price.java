package com.sh.pizza.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PIZZA_Pricing")
public class Price implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String sizes;
	@Column
	private double price;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ITEMID")
	private Item item;
	public Price() {	
		this(0, "", 0.0);
	}
	public Price(int id, String sizes, double price) {
		this.id = id;
		this.sizes = sizes;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return String.format("Price [id=%s, sizes=%s, price=%s]", id, sizes, price);
	}
}

