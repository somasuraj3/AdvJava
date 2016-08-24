package com.bkshop.models;

import java.util.List;

public class Books {
	String[] book;
	List<Book> bookList;
	public Books() {
	}
	public String[] getBook() {
		return book;
	}
	public void setBook(String[] book) {
		this.book = book;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}
