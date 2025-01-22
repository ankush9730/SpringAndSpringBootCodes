package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("creaditeCardPayment")
public class CreaditCardPayment implements PaymentStrategy{
	

	 
	public void pay(double amount) {
		System.out.println("paid $"+amount+" Using Creadit Card ");		
	}

}
