package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.main.sbeans.Vehicle;

@SpringBootApplication
public class SpringBootIocProj02DependencyInjectionApplication {

	public static void main(String[] args) {
		//got IOC Container
		ApplicationContext ctx=SpringApplication.run(SpringBootIocProj02DependencyInjectionApplication.class, args);
		
		//get Access target spring bean object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("Hyd", "Delhi");
		
		//close the container
		((ConfigurableApplicationContext)ctx).close();
	}

}
