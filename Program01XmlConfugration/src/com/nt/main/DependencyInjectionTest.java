package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		//create IOC Container
		@SuppressWarnings("resource")
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContxt.xml");
		
		//get Target spring bean class object ref from the IOC container
		Object obj=ctx.getBean("wmg");
		
		//Type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		String result=generator.generateWishMessage("Ankush");
		System.out.println(result);
	}

}
