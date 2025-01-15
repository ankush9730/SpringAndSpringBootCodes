package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyClass {

	public static void main(String[] args) {
		 //Create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator g=ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result=g.getWishMessage("Ankush");
		System.out.println(result);
		ctx.close();
	}

}
