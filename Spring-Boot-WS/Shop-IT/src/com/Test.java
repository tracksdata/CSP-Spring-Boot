package com;

import com.pricematrix.BillerImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {
		
		String[] cart1 = { "I001", "I002", "I003" };
		String[] cart2 = { "I004", "I005" };
		
		
		//-------------------------------------------
		  PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency class object
		//--------------------------------------------

		BillerImpl biller = new BillerImpl(); // Dependent class object
		
		biller.setPrice(price); // DI 
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);
		
		
		biller.test();
		
	}

}
