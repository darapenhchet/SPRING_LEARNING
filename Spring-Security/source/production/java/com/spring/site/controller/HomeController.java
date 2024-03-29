package com.spring.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/admin")
	public String index() {
		System.out.println("HOME CONTROLLER...");
		return "admin";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		System.out.println("STARTING LOGIN FORM");
		ModelAndView model = new ModelAndView();
		System.out.println(error);
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;
	}
	
	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginProc(
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		System.out.println("STARTING LOGIN FORM");
		ModelAndView model = new ModelAndView();
		System.out.println(username);
		System.out.println(password);
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("home");

		return model;
	}*/
	
	

	@RequestMapping(value = "/signup")
	public String signup() {
		System.out.println("SIGNUP");
		return "signup";
	}
}
