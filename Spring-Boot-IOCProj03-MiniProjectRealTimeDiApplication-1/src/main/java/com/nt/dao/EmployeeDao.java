package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDao implements IEmployeeDao {

    private static final String GET_EMPS_QUERY = "SELECT EMPNO, EMPNAME, DESG, SALARY, DEPTNO, GROSSSALARY, NETSALARY FROM EMP WHERE DESG IN (?, ?, ?)";
    private static final String INSERT_EMP_QUERY = "INSERT INTO EMP (EMPNO, EMPNAME, DESG, SALARY, DEPTNO, GROSSSALARY, NETSALARY) VALUES (?, ?, ?, ?, ?, ?, ?)";

    @Autowired
    private DataSource ds;

    @Override
    public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
        List<Employee> list = new ArrayList<>();
        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY)) {
            ps.setString(1, desg1);
            ps.setString(2, desg2);
            ps.setString(3, desg3);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Employee emp = new Employee();
                    emp.setEmpno(rs.getInt(1));
                    emp.setEmpname(rs.getString(2));
                    emp.setDesg(rs.getString(3));
                    emp.setSalary(rs.getDouble(4));
                    emp.setDeptno(rs.getString(5));
                    emp.setGrossSalary(rs.getDouble(6));
                    emp.setNetSalary(rs.getDouble(7));
                    list.add(emp);
                }
            }
        }
        return list;
    }

    @Override
    public int insertEmployee(Employee emp) throws Exception {
        int result = 0;
        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement(INSERT_EMP_QUERY)) {
            ps.setInt(1, emp.getEmpno());
            ps.setString(2, emp.getEmpname());
            ps.setString(3, emp.getDesg());
            ps.setDouble(4, emp.getSalary());
            ps.setString(5, emp.getDeptno());
            ps.setDouble(6, emp.getGrossSalary());
            ps.setDouble(7, emp.getNetSalary());
            result = ps.executeUpdate();
        }
        return result;
    }
}
