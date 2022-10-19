package com.first;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Firstapp{
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/register")
	public String view() {
		
			return "register";
		}
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
		
	@RequestMapping("/contactus")
	public String homepage() {
		return "contactus";
	}
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String successfull(@ModelAttribute User user, Model m) {
		System.out.println(user);
		m.addAttribute("user", user);
		this.userService.createUser(user);
		return "processform";
	}
	}