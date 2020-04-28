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

		// Save

		//Product prod = new Product();
		//Product prod=ps.findById(10);
		//prod.setId(10);
		//prod.setName("Gun");
		//prod.setDescription("Rocket Launcher");
		//prod.setPrice(1500);

		//ps.saveProduct(prod);
		
		
		// List all records
		
		/*ps.findAll().forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------");
		});
		*/
		
		//System.out.println("Total Records: ==> "+ps.count());
		
		//ps.delete(4);
		
		  /*  ps.findByName("%a%").forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------");
		});
		
		*/
		    
		    
		// --------------
		    
		  /*  ps.findProductByPriceBetween(500, 2000).forEach(prod->{
				System.out.println(prod.getId());
				System.out.println(prod.getName());
				System.out.println(prod.getPrice());
				System.out.println(prod.getDescription());
				System.out.println("------------------------");
			});
			
			*/
		    
		    
		  //-------------------------
		    
		    ps.findAllProductsAboveGivenId(5).forEach(prod->{
				System.out.println(prod.getId());
				System.out.println(prod.getName());
				System.out.println(prod.getPrice());
				System.out.println(prod.getDescription());
				System.out.println("------------------------");
			});
		

	}

}
