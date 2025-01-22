package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
@Component("payment")
public class PaymentContext {

	@Autowired
	private PaymentStrategy paymentStrategy; //HAS-A property
	
	 
	@Autowired						//Constructor injection
	public PaymentContext(PaymentStrategy paymentStrategy) {
		super();
		this.paymentStrategy = paymentStrategy;
	}



	//Execute the strategy
	public void processPayment(double amount) {
		if(paymentStrategy==null) {
			System.out.println("No payment Strategy selected!");
			return;
		}
		 paymentStrategy.pay(amount);
	}
	
}
