package com.bkshop.ctls;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bkshop.models.Book;
import com.bkshop.models.Books;
import com.bkshop.models.Subjects;
import com.bkshop.svcs.BookService;

@RequestMapping("/book")
@Controller
public class BookController {
	@Autowired
	BookService svc;

	@RequestMapping("/newcart")
	public String createCart(HttpSession session, HttpServletRequest req){
		session.setAttribute("cart", new ArrayList<Book>());
		Enumeration<String> attrs = session.getAttributeNames();
		while (attrs.hasMoreElements()) {
			String attr = (String) attrs.nextElement();
			System.out.println(" *** " + attr + " --> " + session.getAttribute(attr));
		}
		return "redirect:/book/subjects";
	}

	@RequestMapping("/subjects")
	public ModelAndView showSubjects() {
		List<String> subList = svc.getSubjects();
		Subjects subs = new Subjects();
		subs.setSubList(subList);
		return new ModelAndView("subjects", "sb", subs);
	}
	
	@RequestMapping("/showbooks")
	public ModelAndView showSubjectBooks(@ModelAttribute("sb") Subjects sb) {
		String sub = sb.getSubject();
		System.out.println("Selected Subject : " + sub);
		List<Book> bkList = svc.findSubjectBooks(sub);
		Books bks = new Books();
		bks.setBookList(bkList);
		return new ModelAndView("books", "bks", bks);
	}
	
	@RequestMapping("/addcart")
	public String addToCart(@ModelAttribute("bks") Books bks, HttpSession session){
		String[] selBookIds = bks.getBook();
		List<Book> cart = (List<Book>) session.getAttribute("cart");
		for (String bookid : selBookIds) {
			Book b = svc.findBook(Integer.parseInt(bookid));
			cart.add(b);
		}
		return "redirect:/book/subjects";
	}

	@RequestMapping("/showcart")
	public String showCart(Model m, HttpSession session){
		List<Book> cart = (List<Book>) session.getAttribute("cart");
		double sum = 0.0;
		for (Book b : cart) {
			sum += b.getPrice();
		}
		m.addAttribute("bill", sum);
		return "cart";
	}
}
