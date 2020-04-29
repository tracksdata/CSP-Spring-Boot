package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductContoller {

	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println("--- f1 method");
	}
	
	@RequestMapping(value = "/s2")
	public String f2() {
		System.out.println("--- f2 method");
		return "one";
	}

}
