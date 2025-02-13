package com.nt.model;

import java.io.Serializable;

import lombok.Data;


 @Data
public class Employee implements Serializable 
{
 
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String string) {
		this.deptno = string;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	private Integer empno;
	private String empname;
	private String desg;
	private Double salary;
	private String deptno;
	private Double grossSalary;
	private Double netSalary;
	
	
}
