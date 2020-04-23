package com.pricematrix;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//Dependency
@Repository
@Lazy
//@Scope(value="prototype")
public class PriceMatrixImpl implements PriceMatrix {
	
	
	
	

	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl object created on " + System.identityHashCode(this) + " hashcode");
	}

	public void sayHello() {
		System.out.println("Hello....");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch itemCode price from DB

		return 100.00;
	}

}
