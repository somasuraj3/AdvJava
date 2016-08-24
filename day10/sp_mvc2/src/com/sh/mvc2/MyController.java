package com.sh.mvc2;

import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/index")
	public ModelAndView gotoIndex(Locale locale) {
		System.out.println("Welcome : " + locale);
		LoginModel login = new LoginModel();
		ModelAndView mav = new ModelAndView("index", "login", login);
		return mav;
	}
	/*
	@RequestMapping("/login")
	public String doLogin(@ModelAttribute("user") LoginModel lm) {
		System.out.println(lm);
		return "menu";
	}
	*/
	/*
	@RequestMapping("/login")
	public ModelAndView doLogin(LoginModel lm) {
		System.out.println(lm);
		ModelAndView mav = new ModelAndView("menu", "user", lm);
		return mav;
	}
	*/
	/*
	@RequestMapping("/login")
	public String doLogin(Model model, LoginModel lm) {
		System.out.println(lm);
		model.addAttribute("user", lm);
		return "menu";
	}
	*/
	@RequestMapping("/login")
	public String doLogin(Map<String, Object> modelMap, LoginModel lm) {
		System.out.println(lm);
		if(loginService.validate(lm))
		{
			modelMap.put("user", lm);
			return "menu";
		}
		//modelMap.put("login", lm);
		//return "index"; // goto index.jsp page
		return "redirect:index"; //redirect user to /index req handler method
	}
	
	@RequestMapping("/newuser")
	public ModelAndView doNewUser() {
		Login user = new Login();
		ModelAndView mav = new ModelAndView("register", "user", user);
		return mav;
	}
	
	@RequestMapping("/register")
	public String doRegister(Model model, @Valid @ModelAttribute("user") Login login, BindingResult res) {
		System.out.println(res.toString());
		if(!res.hasErrors()) {
			//compare password and confirm password
			//if not matching, add error manually
			//res.addError("passwords not matching");
		}
		if(res.hasErrors()) {
			model.addAttribute("status", "Form submission has errors.");
			return "register";
		}
		model.addAttribute("status", "Form submission is successful.");
		return "register";
	}
}

