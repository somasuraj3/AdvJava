package com.sh.hb;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*
// If using Book.hbm.xml file
<class name="Book" table="BOOKS">
	<cache usage="read-only"/>
	<id name="bookid" column="ID" type="int"/>
	<property name="name" column="NAME"  type="java.lang.String"/>
	// ...
</class>
*/
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
@Table(name="BOOKS")
public class Book implements Serializable {
	@Id
	@Column(name="ID")
	private int bookid;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private String subject;
	@Column
	private double price;

	public Book() {
		this(0, "", "", "", 0.0);
	}

	public Book(int bookid, String name, String author, String subject, double price) {
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Book [bookid=%s, name=%s, author=%s, subject=%s, price=%s]", bookid, name, author,
				subject, price);
	}
	
}
