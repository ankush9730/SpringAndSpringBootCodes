package com.nt.main;

import com.nt.beans.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {

		//get Flipkart class object
		Flipkart fpkt=FlipkartFactory.getInstance("blueDart");
		
		//invoke business method
		String msg=fpkt.shopping(new String[] {"shirt", "trousr","kite","manza"},
				new double[] {3000.0,4000.0,400.0,300.0});
		
		System.out.println(msg);
	}

}
