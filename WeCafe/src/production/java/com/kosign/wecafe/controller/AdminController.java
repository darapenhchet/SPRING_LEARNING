package com.kosign.wecafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@RequestMapping(value={"/dashboard","/","/home"})
	public String dashboard(){
		return "admin/dashboard";
	}
	
	@RequestMapping(value="/productlist")
	public String productlist(){
		return "admin/productlist";
	}
	
	@RequestMapping(value="/productadd")
	public String productadd(){
		return "admin/productadd";
	}
	
	@RequestMapping(value="/categorylist")
	public String categorylist(){
		return "admin/categorylist";
	}
	
	@RequestMapping(value="/cagetoryadd")
	public String categoryadd(){
		return "admin/categoryadd";
	}
	
	@RequestMapping(value="/orderlist")
	public String orderlist(){
		return "admin/orderlist";
	}
	
	@RequestMapping(value="/orderadd")
	public String orderadd(){
		return "admin/orderadd";
	}
	
	@RequestMapping(value="/salelist")
	public String salelist(){
		return "admin/salelist";
	}
	
	@RequestMapping(value="/saleadd")
	public String saleadd(){
		return "admin/saleadd";
	}
	
	@RequestMapping(value="/supplierlist")
	public String supplierlist(){
		return "admin/supplierlist";
	}
	
	@RequestMapping(value="/supplieradd")
	public String supplieradd(){
		return "admin/supplieradd";
	}
	
}
