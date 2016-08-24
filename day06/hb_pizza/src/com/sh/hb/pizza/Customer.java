package com.sh.hb.pizza;

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
public class Customer {
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
}
