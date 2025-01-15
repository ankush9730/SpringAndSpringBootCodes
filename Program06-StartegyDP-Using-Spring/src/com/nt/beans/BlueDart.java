package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements ICourier {

	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart(0-param const)");
	}

	@Override
	public String deliver(int oid) {

		return "product is assign to deliver BlueDart with " + oid + " order id";
	}

}