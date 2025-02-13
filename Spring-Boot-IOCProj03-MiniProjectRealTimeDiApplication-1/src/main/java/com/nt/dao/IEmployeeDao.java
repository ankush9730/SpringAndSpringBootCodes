package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDao {
    List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception;
    int insertEmployee(Employee emp) throws Exception;  // New method for insertion
}

