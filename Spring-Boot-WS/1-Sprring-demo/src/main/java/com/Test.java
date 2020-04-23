package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.pricematrix.BillerImpl;
import com.pricematrix.PriceMatrix;

public class Test {

	public static void main(String[] args) {

		System.out.println("---- main method");

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		BillerImpl bill = ac.getBean(BillerImpl.class); // Dependent
		

		String cart1[] = { "P001", "P002" };
		String cart2[] = { "P001", "P002", "P003" };

		double total = bill.getCartTotal(cart1);
		System.out.println("Cart1 Total: " + total);

		total = bill.getCartTotal(cart2);
		System.out.println("Cart2 Total: " + total);

		/*
		 * PriceMatrix price1=ac.getBean(PriceMatrix.class); // used class PriceMatrix
		 * price2=ac.getBean(PriceMatrix.class); PriceMatrix
		 * price3=ac.getBean(PriceMatrix.class); PriceMatrix
		 * price4=ac.getBean(PriceMatrix.class); PriceMatrix
		 * price5=ac.getBean(PriceMatrix.class);
		 */

	}

}
