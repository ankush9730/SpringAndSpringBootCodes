package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("payroll")
public class PayRollOperationController {

    @Autowired
    private IEmployeeService service;

    public List<Employee> showAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
        return service.fetchAllEmployeeByDesgs(desg1, desg2, desg3);
    }

    public String registerEmployee(Employee emp) throws Exception {
        return service.registerEmployee(emp);
    }
}
