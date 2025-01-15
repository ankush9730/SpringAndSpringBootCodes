package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("fpkt")
public class Flipkart {

	 @Autowired
	private ICourier courier;
	
	
	public String shopping(String items[],double price[]) {
		
		System.out.println("Flipkart.shopping()");
		double totalAmt = 0.00;
		
		for(double d:price) {
			
			totalAmt+=d;
		} 
		
		int oid = new Random().nextInt(10000);
		String msg = courier.deliver(oid);
		 
		return Arrays.toString(items)+"item are shpping having billAmount "+totalAmt+" ----> "+msg;
		
	}
	
	 
}