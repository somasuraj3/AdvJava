package com.bkshop.ctls;

import java.security.Principal;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.bkshop.models.Book;
import com.bkshop.models.Login;
import com.bkshop.svcs.BookService;

@Controller
public class LoginController {
	@Autowired
	private WebApplicationContext ctx;
	
	@RequestMapping("/login")
	public String login() {
		//WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sc);
		//ClassName obj = ctx.getBean(ClassName.class);
		System.out.println(ctx);
		System.out.println(ctx.getParent());
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
	}
	
	@RequestMapping("/auth")
	public String authorizeUser(HttpServletRequest req, Principal prn) {
		if(req.isUserInRole("ROLE_USER"))
			return "forward:/book/newcart";
		else
			return "forward:/admin/newbook";
	}
}
