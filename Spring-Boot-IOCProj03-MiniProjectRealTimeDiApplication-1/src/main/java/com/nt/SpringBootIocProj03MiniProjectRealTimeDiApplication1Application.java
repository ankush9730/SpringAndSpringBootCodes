package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayRollOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringBootIocProj03MiniProjectRealTimeDiApplication1Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(SpringBootIocProj03MiniProjectRealTimeDiApplication1Application.class, args);

        PayRollOperationController controller = ctx.getBean("payroll", PayRollOperationController.class);

        // Fetch employees
        List<Employee> allEmployees = controller.showAllEmployeeByDesgs("Clerk", "Salesman", "Manager");
        allEmployees.forEach(System.out::println);

        // Insert a new employee
        Employee emp = new Employee();
        emp.setEmpno(1001);
        emp.setEmpname("John Doe");
        emp.setDesg("Developer");
        emp.setSalary(50000.0);
        emp.setDeptno("IT");

        String result = controller.registerEmployee(emp);
        System.out.println(result);
    }
}
