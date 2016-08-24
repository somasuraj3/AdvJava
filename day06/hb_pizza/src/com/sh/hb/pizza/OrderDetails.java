package com.sh.hb.pizza;

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
public class OrderDetails {
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
}




