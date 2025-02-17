package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.Company;


@SpringBootApplication
@ComponentScan("com.nt.beans")  // Ensure Spring scans the package
public class SpringBootIocProj05ConfigurationPropertiesApplication
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(SpringBootIocProj05ConfigurationPropertiesApplication.class, args);

        Company company = ctx.getBean("comp", Company.class);
        System.out.println(company);

        
        ((ConfigurableApplicationContext) ctx).close();
    }
}
