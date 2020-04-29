package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		
		ProductServiceImpl ps=ac.getBean(ProductServiceImpl.class);
		
		Product prod=new Product();
		prod.setId(101);
		prod.setName("Mobile");
		prod.setDescription("Samsung S20");
		prod.setPrice(12000);
		
		ps.saveProduct(prod);
		
		
	}

}
