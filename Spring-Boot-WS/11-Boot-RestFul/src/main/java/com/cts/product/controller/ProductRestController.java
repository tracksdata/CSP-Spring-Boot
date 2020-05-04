package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.model.Product;

@RestController
public class ProductRestController {

	// Every must must return a value (String / Objects)

	// @RequestMapping(value ="/s1",method = RequestMethod.GET)
	@GetMapping("/s1")
	public String f1() {
		return "Welcome to Spring Rest APP";
	}

	// Return a Java class Object -> JSON / XML

	@GetMapping("/s2")
	public Product f2() {

		Product p1 = new Product(10, "Pen", "Red Ink", 87.65);

		return p1;

	}

	@GetMapping("/s3")
	public List<Product> f3() {
		Product p1 = new Product(10, "Pen", "Red Ink", 55);
		Product p2 = new Product(11, "Book", "White Pages", 376);
		Product p3 = new Product(12, "Laptop", "Dell Core i7", 85000);
		Product p4 = new Product(13, "Mobile", "Samsungb S20", 120000);
		Product p5 = new Product(14, "Watch", "Rolex", 1000);

		List<Product> prods = new ArrayList<Product>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		return prods;

	}

}
