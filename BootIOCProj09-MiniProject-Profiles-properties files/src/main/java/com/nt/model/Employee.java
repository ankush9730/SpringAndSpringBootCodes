package com.nt.model;

import lombok.Data;

//java bean
@Data
public class Employee {
	//java bean properties
	private   Integer empno;
	private  String ename;
	private   String  desg;
	private   Double   salary;
	private    Integer deptno;
	private   Double grossSalary;
	private   Double   netSalary;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
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
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + ", deptno="
				+ deptno + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}
	
	
		
	
	

}
