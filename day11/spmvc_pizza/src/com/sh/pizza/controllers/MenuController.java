package com.sh.pizza.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sh.pizza.entities.Item;
import com.sh.pizza.entities.Price;
import com.sh.pizza.services.MenuService;

@Controller
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/menu")
	public String doMenu(Model model, 
			@RequestParam(value="type", required=false) String type,
			@RequestParam(value="category", required=false) String category) {
		System.out.println("TYPE : " + type);
		// fetch types from database
		List<String> typeList = menuService.fetchTypes();
		model.addAttribute("typeList", typeList);
		// fetch categories from database
		if(type!=null) {
			List<String> categoryList = menuService.fetchCategories(type);
			model.addAttribute("categoryList", categoryList);
		}
		// fetch items from database
		if(type!=null && category!=null) {
			List<Item> itemList = menuService.fetchItems(type, category);
			model.addAttribute("itemList", itemList);
		}
		return "t_menu";
	}
	
	@RequestMapping("/showitem")
	public String doShowItem(Model model, @RequestParam("id") int id) {
		Item it = menuService.fetchItem(id);
		Price itp = new Price(); //it.getPriceList().get(0);
		model.addAttribute("it", it);
		model.addAttribute("itp", itp);
		return "t_item";
	}
}
