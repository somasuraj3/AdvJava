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
@Table(name="PIZZA_OrderDetails")
public class OrderDetails implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDERID")
	private Order order;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRICEID")
	private Price price;
	public OrderDetails() {
		this(0);
	}
	public OrderDetails(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("OrderDetails [id=%s]", id);
	}
}




