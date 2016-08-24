package com.sh.hb.pizza;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PIZZ_ITEMS")
public class Item {
	@Id
	//@GenericGenerator(name="mygen", strategy="increment")
	//@GeneratedValue(generator="mygen")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String type;
	@Column
	private String category;
	@Column
	private String description;
	@OneToMany(mappedBy="item", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Price> priceList;
}

