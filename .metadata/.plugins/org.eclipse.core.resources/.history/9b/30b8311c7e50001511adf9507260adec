package com.spring.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public String index(){
		System.out.println("HOME CONTROLLER...");
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String login(){
		System.out.println("LOGIN");
		return "login";
	}
	
	@RequestMapping(value="/signup")
	public String signup(){
		System.out.println("SIGNUP");
		return "signup";
	}
}
