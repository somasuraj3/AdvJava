package com.sh.hbtemp;

import java.util.List;

public interface BookDao {
	List<Book> getAllBooks();
	List<Book> getSubjectBooks(String subject);
	void addBook(Book b);
}
