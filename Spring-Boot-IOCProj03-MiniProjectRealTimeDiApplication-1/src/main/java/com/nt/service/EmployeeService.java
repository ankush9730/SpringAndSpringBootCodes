package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeDao dao;

    @Override
    public List<Employee> fetchAllEmployeeByDesgs(String degs1, String degs2, String degs3) throws Exception {
        degs1 = degs1.toUpperCase();
        degs2 = degs2.toUpperCase();
        degs3 = degs3.toUpperCase();
        List<Employee> list = dao.getEmployeeByDesgs(degs1, degs2, degs3);
        list.forEach(emp -> {
            emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
            emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
        });
        return list;
    }

    @Override
    public String registerEmployee(Employee emp) throws Exception {
        emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
        emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
        int result = dao.insertEmployee(emp);
        return result == 1 ? "Employee inserted successfully!" : "Employee insertion failed!";
    }
}
