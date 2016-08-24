package com.sh.pizza.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PIZZA_Customers")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private String mobile;
	@OneToMany(mappedBy="cust", fetch=FetchType.LAZY)
	private List<Order> orderList;
	public Customer() {
		this(0, "", "", "", "", "");
	}
	public Customer(int id, String name, String password, String address, String email, String mobile) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s, password=%s, address=%s, email=%s, mobile=%s]", id, name,
				password, address, email, mobile);
	}
}
