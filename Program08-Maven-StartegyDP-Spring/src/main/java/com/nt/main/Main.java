package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.PaymentContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentContext py=ctx.getBean("payment",PaymentContext.class);
		    py.processPayment(200.25);
		  ctx.close();
		
		}

}
