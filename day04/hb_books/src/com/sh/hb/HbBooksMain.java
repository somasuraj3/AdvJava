package com.sh.hb;

import java.util.List;

public class HbBooksMain {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		
		try {
			dao.open();
			Book b1 = dao.find(101);
			System.out.println(b1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		
		
		
		try {
			dao.open();
			Book b2 = new Book(99, "ABCD", "PQR", "XYZ", 1234);
			dao.insert(b2);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(dao!=null)
				dao.close();
		}
		
		
		
		
		dao.open();
		List<Book> list1 = dao.getAll();
		for (Book b : list1) {
			System.out.println(b);
		}
		dao.close();
		
		
		
		dao.open();
		List<Book> list2 = dao.getBooksOfSubject("C");
		for (Book b : list2) {
			System.out.println(b);
		}
		dao.close();
		
		
		
		
		dao.open();
		List<Book> list3 = dao.getBooksOfSubjectAuthor("C", "KANETKAR");
		for (Book b : list3) {
			System.out.println(b);
		}
		dao.close();
		
	}
}	


