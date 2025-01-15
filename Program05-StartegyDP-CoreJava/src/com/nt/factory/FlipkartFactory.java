package com.nt.factory;

import com.nt.beans.BlueDart;
import com.nt.beans.DTDC;
import com.nt.beans.Flipkart;
import com.nt.beans.ICourier;

public class FlipkartFactory {

	 // static factory method creating and returning  Flipkart classs obj
	public static Flipkart getInstance(String courierType) {
		//create dependent class object
		ICourier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid Courier Type");
		
		//Create target class Object
		Flipkart fpkt=new Flipkart();
		
		//assign dependent class object to target class object
		fpkt.setICourier(courier);
		return fpkt;
	}
}
