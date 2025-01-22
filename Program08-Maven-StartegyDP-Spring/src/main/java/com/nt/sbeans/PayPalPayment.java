package com.nt.sbeans;

public class PayPalPayment implements PaymentStrategy{

	public void pay(double amount) {
		System.out.println("paid $"+amount+" Using payPal");
	}
	 

	

}
