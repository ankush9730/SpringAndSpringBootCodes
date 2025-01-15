package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Flipkart;
import com.nt.config.applicationConfig;

public class Main {

	public static void main(String[] args) {
		// Create a container
 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(applicationConfig.class);

		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
 
		String result = fpkt.shopping(new String[] { "shirts", "trouser" }, new double[] { 2000, 6000 });
		System.out.println(result);
		// closer the IOC Container
		ctx.close();
	} 

}