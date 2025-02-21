package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.PersonDetails;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class BootProj06BulkInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//Access the  IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj06BulkInjectionUsingConfigurationPropertiesApplication.class, args);
		// get Acccess to spring bean class object ref
		PersonDetails  details=ctx.getBean("pDetails",PersonDetails.class);
		//Display the data
		System.out.println("Data is ::"+details);
		
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
