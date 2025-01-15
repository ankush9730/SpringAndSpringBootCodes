package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public class DTDCCourier implements ICourier {

	
	public DTDCCourier() {
		System.out.println("DTDCCourier.DTDCCourier(0-param const)");
	}

	@Override
	public String deliver(int oid) {

		return "product is assign to deliver dtdc with "+oid+" order id"; 
	}

	 
}