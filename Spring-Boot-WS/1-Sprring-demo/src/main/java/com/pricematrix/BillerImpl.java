package com.pricematrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//Dependent
@Service
@Lazy
public class BillerImpl { // Dependent
	
	
	@Autowired
	private PriceMatrix price;

	
	public double getCartTotal(String[] cart) { // testing issue

		// PriceMatrixImpl price = new PriceMatrixImpl(); // Dependency

		double total = 0.0;
		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
