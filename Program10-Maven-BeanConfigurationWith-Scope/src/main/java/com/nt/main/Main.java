package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.MyBean;

public class Main {

	public static void main(String[] args) {
		
	//Load the spring application context
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get the bean multiple times
		MyBean bean1=ctx.getBean(MyBean.class);
		MyBean bean2=ctx.getBean(MyBean.class);
		
		bean1.showMessage();
		
		//Check if bean1 and bean2 are the same instance
		System.out.println("Are the two beans the same? "+(bean1==bean2));
		
		ctx.close();
	}

}
