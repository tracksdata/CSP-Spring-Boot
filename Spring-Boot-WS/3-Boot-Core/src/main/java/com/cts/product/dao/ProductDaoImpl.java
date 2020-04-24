package com.cts.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("db.properties")
public class ProductDaoImpl {
	
	//@Autowired
	//private Environment env;

	@Value("${name}")
	private String productName;
	@Value("${db.driver}")
	private String drvMessage;
	
	@Value("${db}") //SpEL
	private String dbFileProperty;
	
	
	
	

	public void saveProduct() {
		System.out.println("DAO: --- Saving Product " + productName);
		System.out.println("Driver MSG: "+drvMessage);
		System.out.println("--- Message: "+dbFileProperty);
	
	}

}
