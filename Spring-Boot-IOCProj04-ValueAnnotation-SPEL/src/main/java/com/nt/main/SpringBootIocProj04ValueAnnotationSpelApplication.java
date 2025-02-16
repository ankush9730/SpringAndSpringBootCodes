package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbeans.Hotel;

@SpringBootApplication
@ComponentScan("com.nt")
public class SpringBootIocProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) 
	{
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(SpringBootIocProj04ValueAnnotationSpelApplication.class, args);
		
		//get Hotel object ref
		Hotel hotel1=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel1);
		//close the IOC Container
		((ConfigurableApplicationContext)ctx).close();
	}
}
