package com.nt.main;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.main.sbeans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootIocAssignment01DependencyInjectionApplication {

	@Bean(name="id")
	public  LocalTime getTime() {
		return LocalTime.now();
	}
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootIocAssignment01DependencyInjectionApplication.class, args);
		
		WishMessageGenerator w=ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result=w.getMessage("Ankush...!");
		System.out.println(result);
		
		 ((ConfigurableApplicationContext)ctx).close();
		 
	}

}
