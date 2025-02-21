package com.nt;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties.ShowSummaryOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollMgmtOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj04MiniProjectRealtimeDiApplication2 {

	public static void main(String[] args) {

try(//get  access to IOC contaner
		ConfigurableApplicationContext ctx=SpringApplication.run(BootIocProj04MiniProjectRealtimeDiApplication2.class, args);
		//get Sccanner object
		Scanner sc=new Scanner(System.in);
		){
		// get Controller Spring bean class obj ref
		PayrollMgmtOperationsController  controller=ctx.getBean("payroll-controller",PayrollMgmtOperationsController.class);
		
		// read inputs from the enduser
		System.out.println("Enter ename ::");
		String name=sc.next();
		
		System.out.println("Enter Desg ::");
		String desg=sc.next();
		
		System.out.println("Enter salary ::");
		double salary=sc.nextDouble();
		
		System.out.println("Enter dept no (10,20,30,40,...) ::");
		Integer deptno=sc.nextInt();
		
		//create Employee class object
		Employee emp=new Employee();
		emp.setEname(name); emp.setDesg(desg); emp.setSalary(salary);
		emp.setDeptno(deptno);
		
		//invoke the b.methods
			String msg=controller.appointEmployee(emp);
			//display  result
			System.out.println(msg);
		}//try
		catch(Exception e) {
			System.out.println("Internal problem::"+e.getMessage());
			e.printStackTrace();
		}
		
		
	}//main
}//class
