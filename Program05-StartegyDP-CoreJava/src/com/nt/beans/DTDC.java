package com.nt.beans;

public class DTDC implements ICourier{

	public DTDC() {
		System.out.println("DTDC:: 0-param counstructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+"order id order items ready to deliver using DTDC Courier Service";
	}
}
