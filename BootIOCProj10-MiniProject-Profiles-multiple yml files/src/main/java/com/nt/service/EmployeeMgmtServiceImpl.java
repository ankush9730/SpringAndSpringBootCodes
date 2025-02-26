package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
   @Autowired
	private  IEmployeeDAO  empDAO;
   
   public EmployeeMgmtServiceImpl() {
    System.out.println("EmployeeMgmtServiceImpl:: 0-param constructor");
  }
   
	@Override
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
	  System.out.println("EmployeeMgmtServiceImpl.fetchEmployeesByDesgs()");
	     //convert the desgs (inputs) to upper case letters  (b.logic)
		  desg1=desg1.toUpperCase();
		  desg2=desg2.toUpperCase();
		  desg3=desg3.toUpperCase();
		//use  DAO
		  List<Employee>  list=empDAO.showEmployeesByDesgs(desg1, desg2, desg3);
		  //calculate  gross Salary and  NetSalary  (b.logic)
		  list.forEach(emp->{
			  emp.setGrossSalary(emp.getSalary()+ (emp.getSalary()*0.4));
			  emp.setNetSalary(emp.getGrossSalary()- (emp.getGrossSalary()* 0.15));
		  });
		
		return list;
	}
	
	@Override
		public String registerEmployee(Employee emp) throws Exception {
	  System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
			//use DAO
		int count=empDAO.insertEmployee(emp);
			return count==0?" Employee not registerd":" Employee is registered";
		}

}
