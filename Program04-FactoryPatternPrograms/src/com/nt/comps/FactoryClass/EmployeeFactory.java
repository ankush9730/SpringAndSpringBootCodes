package com.nt.comps.FactoryClass;

import com.nt.comps.AndroidDeveloper;
import com.nt.comps.Employee;
import com.nt.comps.WebDeveloper;

public class EmployeeFactory {

	// get the employee
	public static Employee getEmployee(String empType) {

		if (empType.equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		}

		else if (empType.equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		} else {
			return null;
		}
	}
}
