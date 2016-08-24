package com.sh.pizza.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PIZZA_Orders")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private Date orderTime;
	@Column
	private String status;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMERID")
	private Customer cust;
	@OneToMany(mappedBy="order", fetch=FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<OrderDetails> detailList;
	public Order() {
		this(0, new Date(), "");
	}
	public Order(int id, Date orderTime, String status) {
		this.id = id;
		this.orderTime = orderTime;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public List<OrderDetails> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<OrderDetails> detailList) {
		this.detailList = detailList;
	}
	@Override
	public String toString() {
		return String.format("Order [id=%s, orderTime=%s, status=%s]", id, orderTime, status);
	}
}
