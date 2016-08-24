package com.sh.jdbctemp;

import java.util.List;

public interface BookDao {
	void addBook(Book b);
	Book getBook(int id);
	List<Book> getAllBooks();
	List<Book> getAllTest();
}

