package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;

@Controller
public class ProductController {

	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println("--- Welcome to f1 method");
	}

	@RequestMapping(value = "/s2")
	public void f2() {
		String name = "Praveen";
		System.out.println("--- Name is " + name);
	}

	// Redirect to a View -> JSP

	@RequestMapping("/s3")
	public String f3(Model data) {
		System.out.println("--- f3 method");
		String cityName = "Hyderabad";
		data.addAttribute("city", cityName); // adds to request scope which is available for view
		return "one";

	}

	@RequestMapping("/s4")
	public ModelAndView f4() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("two");
		mav.addObject("name", "Praveen");
		return mav;
	}

	// send a product to jsp page

	@RequestMapping("/s5")
	public ModelAndView f5() {
		ModelAndView mav = new ModelAndView();
		Product p1 = new Product(10, "Pen", "Red Ink", 34);
		mav.addObject("product", p1);
		mav.setViewName("display");
		return mav;
	}

	@RequestMapping("/s6")
	public ModelAndView f6() {

		Product p1 = new Product(10, "Pen", "Red Ink", 55);
		Product p2 = new Product(11, "Book", "White Pages", 376);
		Product p3 = new Product(12, "Laptop", "Dell Core i7", 85000);
		Product p4 = new Product(13, "Mobile", "Samsungb S20", 120000);
		Product p5 = new Product(14, "Watch", "Rolex", 1000);
		
		List<Product> prods=new ArrayList<Product>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("products");
		mav.addObject("products", prods);

		return mav;
	}

}
