package com.nt.main;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.main.sbeans.FindSeason;

@SpringBootApplication
public class SpringBootIocProj01DependencyInjectionApplication {

    @Bean(name = "id")
    LocalDate createDate() {
    	System.out.println("SpringBootIocProj01DependencyInjectionApplication.createDate()");
		return LocalDate.now();
	}
	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SpringBootIocProj01DependencyInjectionApplication.class, args);
		
		//get Target spring bean class obj
		FindSeason finder=ctx.getBean("sf",FindSeason.class);
		
		//invoke the b.method
		String result=finder.getMessage("Enjoy the season..!");
		System.out.println(result);
		
		//close the IOC container
		((ConfigurableApplicationContext)ctx).close();
	}

}
