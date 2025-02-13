package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeService {
    List<Employee> fetchAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception;
    String registerEmployee(Employee emp) throws Exception; // New method for inserting data
}

