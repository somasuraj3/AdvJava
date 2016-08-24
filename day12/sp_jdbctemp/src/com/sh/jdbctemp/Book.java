package com.sh.jdbctemp;

import java.io.Serializable;

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

public class Book implements Serializable {
	private int bookid;
	private String name;
	private String author;
	private String subject;
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
