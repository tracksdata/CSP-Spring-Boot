package com.pricematrix;

//Dependent
public class BillerImpl {
	
	/*
	 * 	Design Issues
	 * ----------------
	 * 1.Too many Dependency object creations.
	 * 			-> memory issues
	 * 			-> per issues
	 * 
	 *  Why this issue happened?
	 *  --------------------------
	 *  -> Dependent class itself creating Dependency class object
	 *  
	 *  what is the solution?
	 *  ----------------------
	 *  -> Do not create dependency class object in the dependent
	 *  -> Find the object using JNDI technique 
	 *  
	 *  -> JNDI location is tightly binded with dependent class
	 *  
	 *  What is the best solution?
	 *  ----------------------------
	 *  -> Do create create, do not find, instead ask some one (like containers/providers) 
	 *  -> IoC (Inversion of control)
	 *  
	 *  -> DI (Dependency Injection)
	 *  	-> Injecting/passing dependency object to dependent class
	 *  
	 *  DI can be done with two ways
	 *  1. using setter based DI
	 *  2. using constructor based DI
	 */

	private PriceMatrix price;

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " object is garbage collected..");
	}

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}

	public void test() {
		System.out.println("--- test");

		price.sayHello();
		
	}

	public double getCartTotal(String[] cart) { // testing issue

		// PriceMatrixImpl price = new PriceMatrixImpl(); // Dependency

		double total = 0.0;
		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
