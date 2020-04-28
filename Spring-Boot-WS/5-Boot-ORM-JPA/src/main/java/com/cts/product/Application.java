package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductService ps=ac.getBean(ProductService.class);
		
		Product prod=new Product();
		prod.setId(8);
		prod.setName("Bottle");
		prod.setDescription("Water Bottle");
		prod.setPrice(150);
		
		ps.saveProduct(prod);
		
		
	}

}
