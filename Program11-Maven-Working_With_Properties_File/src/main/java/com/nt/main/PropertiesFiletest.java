package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.appConfig;
import com.nt.sbeans.PersonInfo;

public class PropertiesFiletest {

	public static void main(String[] args) {
		//Create IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(appConfig.class);
		
		//get spring bean class obj ref
		PersonInfo into=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(into);
		
		ctx.close();
	}

}
