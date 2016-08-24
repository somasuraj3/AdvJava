package com.sh.hbtemp;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HbTempMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hbtemp.xml");
		ctx.registerShutdownHook();
		BookDao dao = ctx.getBean(BookDao.class);
		
		Book bk = new Book(97, "SH", "ABC", "Spring", 234);
		dao.addBook(bk);
		System.out.println("Book Added.");
		
		List<Book> list = dao.getAllBooks();
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();
		
		list = dao.getSubjectBooks("C");
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();
	}
}
