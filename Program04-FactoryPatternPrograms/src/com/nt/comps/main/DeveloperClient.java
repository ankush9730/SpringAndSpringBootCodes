package com.nt.comps.main;

import com.nt.comps.Employee;
import com.nt.comps.FactoryClass.EmployeeFactory;

public class DeveloperClient {

	public static void main(String[] args) {
		
		Employee employee1=EmployeeFactory.getEmployee("Android Developer");
		System.out.println("Salary: "+employee1.getSalary());
		
		Employee employee2=EmployeeFactory.getEmployee("Web Developer");
		System.out.println("Salary: "+employee2.getSalary());
		
	}
}
