package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private ICourier courier; //HAS-A Property
	
	//setter method of assignment
	public void setICourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	//business method
	public String shopping(String items[],double prices[]) {
		double billAmt=0.0;
		for(double p:prices)
			billAmt=billAmt+p;
		
		//generate the order id
		int oid=new Random().nextInt(1000);
		
		//deliver items
		String msg=courier.deliver(oid);
		
		//send final message
		return Arrays.toString(items)+" are purchsed having prices "+Arrays.toString(prices)+"bill amount::"+billAmt+"..."+msg;
	}
}
