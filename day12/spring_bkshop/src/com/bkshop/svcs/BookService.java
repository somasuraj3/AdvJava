package com.bkshop.svcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bkshop.daos.BookDao;
import com.bkshop.models.Book;

@Service
public class BookService {
	@Autowired
	BookDao bookDao;
	
	public List<String> getSubjects() {
		return bookDao.selectSubjects();
	}
	
	public List<Book> findSubjectBooks(String subject) {
		return bookDao.selectSubjectBooks(subject);
	}

	public Book findBook(int id) {
		return bookDao.selectBook(id);
	}
	
	public void addBook(Book b) {
		bookDao.insertBook(b);
	}
	
	public boolean modifyBook(Book b) {
		Book bk = findBook(b.getBookid());
		if(bk!=null) {
			bk.setName(b.getName());
			bk.setAuthor(b.getAuthor());
			bk.setSubject(b.getAuthor());
			bk.setPrice(b.getPrice());
			bookDao.updateBook(bk);
		}
		return false;
	}
}
