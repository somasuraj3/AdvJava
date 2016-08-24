package com.bkshop.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="BOOKS")
public class Book implements Serializable {
	private int bookid;
	private String name;
	private String author;
	private String subject;
	private double price;
	public Book() {
		this(0,"","","",0.0);
	}
	public Book(int bookid, String name, String author, String subject, double price) {
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}
	@Id
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookid != other.bookid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author="
				+ author + ", subject=" + subject + ", price=" + price + "]";
	}
}
