package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// System.out.println("====> Count od Records: "+ps.count());

		Product prod = new Product();
		prod.setId(9);
		prod.setName("Lock");
		prod.setDescription("Degital Lock");
		prod.setPrice(744);

		// ps.saveProduct(prod);

		// list all records

		/*
		 * ps.findAll().forEach((product)->{ System.out.println(product.getId());
		 * System.out.println(product.getName());
		 * System.out.println(product.getPrice());
		 * System.out.println(product.getDescription());
		 * System.out.println("-----------------------------"); });
		 */

		// update Record

		Product newProd = new Product();
		newProd.setId(5);
		newProd.setName("Iphone12");
		newProd.setDescription("5G Mobile");
		newProd.setPrice(155000);

		// ps.update(newProd);

		// int id = 7;

		// Product product = ps.findById(id);

		/*
		 * if (product != null) {
		 * System.out.println(product.getId());
		 * System.out.println(product.getName());
		 * System.out.println(product.getPrice());
		 * System.out.println(product.getDescription());
		 * System.out.println("-----------------------------"); } else {
		 * System.out.println("No recor found for  id " + id); }
		 * 
		 */

		/*
		 * ps.findByName("a").forEach((p) -> { 
		 * System.out.println(p.getId());
		 * System.out.println(p.getName()); System.out.println(p.getPrice());
		 * System.out.println(p.getDescription());
		 * System.out.println("------------------------"); });
		 * 
		 */

		//int id = 8;
		//int res = ps.delete(id);

		/*
		if (res != 0) {
			System.out.println(id + " product is deleted");
		} else {
			System.out.println("Some issue while deleteing for " + id);
		}
		*/

	}

}
