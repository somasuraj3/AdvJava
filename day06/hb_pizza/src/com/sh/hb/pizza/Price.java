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
@Table(name="PIZZA_Pricing")
public class Price {
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
}

