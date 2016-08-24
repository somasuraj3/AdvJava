package com.sh.jdbctemp;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTempMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbctemp.xml");
		ctx.registerShutdownHook();
		
		BookDao dao = ctx.getBean(BookDao.class);
		
		Book b = dao.getBook(11);
		System.out.println("Found : " + b);
		
		//b = new Book(99, "ABC", "PQR", "XYZ", 123);
		//dao.addBook(b);
		
		System.out.println();
		List<Book> list = dao.getAllTest();
		for (Book bk : list) 
			System.out.println(bk);
		
	}
}

