package com.sh.pizza.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sh.pizza.entities.Price;
import com.sh.pizza.services.MenuService;


@Controller
public class OrderController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/addcart")
	public String doAddCart(@RequestParam("id") int id, HttpSession session) {
		// get item price object from db
		Price ip = menuService.fetchPrice(id);
		// add it into a list in session.
		List<Price> cart = (List<Price>) session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}
		cart.add(ip);
		System.out.println(cart);
		return "redirect:menu";
	}
	
	@RequestMapping("/showcart")
	public String doShowCart() {
		return "t_cart";
	}
}



