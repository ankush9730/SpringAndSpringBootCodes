package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll-controller")
public final class PayrollMgmtOperationsController {
	@Autowired
	private IEmployeeMgmtService   empService;
	
	public PayrollMgmtOperationsController() {
    System.out.println("PayrollMgmtOperationsController:: 0-param constructor");
  }

	  public  List<Employee>   showEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
	    System.out.println("PayrollMgmtOperationsController.showEmployeesByDesgs()");
		  //use  service
		  List<Employee> list=empService.fetchEmployeesByDesgs(desg1, desg2, desg3);
		  return list;
		  
	  }
	  
	  public  String    appointEmployee(Employee  emp)throws Exception {
	    System.out.println("PayrollMgmtOperationsController.appointEmployee()");
		  //use service
		  String msg=empService.registerEmployee(emp);
		  return msg;
	  }
}
