package com.sh.hb;

import java.util.List;

public class HbBooksMain {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		/*
		try {
			dao.open();
			Book b1 = dao.find(101);
			System.out.println(b1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		*/
		
		/*
		try {
			dao.open();
			Book b2 = new Book(99, "ABCD", "PQR", "XYZ", 1234);
			dao.insert(b2);
		} catch(Exception e) {
			e.printStackTimport org.hibernate.Criteria;
import org.hibernate.Session;
race();
		} finally {
			if(dao!=null)
				dao.close();
		}
		*/
		
		/*
		dao.open();
		List<Book> list1 = dao.getAll();
		for (Book b : list1) {
			System.out.println(b);
		}
		dao.close();
		*/
		
		/*
		dao.open();
		List<Book> list2 = dao.getBooksOfSubject("C");
		for (Book b : list2) {
			System.out.println(b);
		}
		dao.close();
		*/
		/*
		dao.open();
		List<Book> list3 = dao.getBooksOfSubjectAuthor("C", "KANETKAR");
		for (Book b : list3) {
			System.out.println(b);
		}
		dao.close();
		*/
		
		/*
		dao.open();
		List<String> list = dao.getSubjects();
		System.out.println(list);
		dao.close();
		*/
		
		/*
		dao.open();
		List<Book> list4 = dao.getBooksOfPriceLT(500);
		for (Book b : list4) {
			System.out.println(b);
		}
		dao.close();
		*/
		
		/*
		dao.open();
		List<Book> list5 = dao.getBooksOfPriceGT(500);
		for (Book b : list5) {
			System.out.println(b);
		}
		dao.close();
		*/

		dao.open();
		List<Book> list5 = dao.getBooksFromSP(500);
		for (Book b : list5) {
			System.out.println(b);
		}
		dao.close();
	}
}	

