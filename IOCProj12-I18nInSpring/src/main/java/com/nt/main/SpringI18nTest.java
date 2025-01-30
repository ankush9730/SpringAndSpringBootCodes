package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class SpringI18nTest {

	public static void main(String[] args) {
		//read   language code and   country from the end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  language code ::");
		String  lang=sc.next();
		
		System.out.println("Enter  country code ::");
		String  country=sc.next();
		
		//prepare Locale object having  language code and  country code
		Locale locale=new Locale(lang, country);
		
			
		//create IOC container
				AnnotationConfigApplicationContext   ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		// call  ctx.getMessage(-)  method to get Locale specific  messages 
				String msg1=ctx.getMessage("welcome.msg", new String[] {"raja"}, locale);
				String msg2=ctx.getMessage("goodbye.msg", new String[] {}, locale);
				String msg3=ctx.getMessage("missing.msg", new String[] {}, locale);
				String msg4=ctx.getMessage("discconect.msg", new String[] {}, locale);
				System.out.println(msg1+" --  "+msg2+" --  "+msg3+" --  "+msg4);
				
				//close the container
				 ctx.close();
	}//main

}//class
