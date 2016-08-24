package com.bkshop.ctls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bkshop.models.Book;
import com.bkshop.svcs.BookService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	@Autowired
	BookService svc;

	@RequestMapping("/newbook")
	public ModelAndView showNewBook() {
		ModelAndView mav = new ModelAndView("newbook", "bk", new Book());
		return mav;
	}
	
	@RequestMapping("/addbook")
	public ModelAndView addNewBook(Model m, @ModelAttribute("bk") Book b) {
		svc.addBook(b);
		System.out.println("BOOK INSERTED : " + b);
		m.addAttribute("book_add_status", "Book is added into database. Bookid is "+b.getBookid());
		ModelAndView mav = new ModelAndView("newbook", "bk", new Book());
		return mav;
	}

	@RequestMapping("/modbook")
	public String modifyBook() {
		return "modbook";
	}
}
