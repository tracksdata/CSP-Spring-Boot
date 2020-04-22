package com.pricematrix;

//Dependency
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
