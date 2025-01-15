package com.nt.beans;

public class BlueDart implements ICourier{

	public BlueDart() {
		System.out.println("BlueDart::o-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+"order id order items ready to deliver using BlueDart Courier Services";
	}
	
	

}
