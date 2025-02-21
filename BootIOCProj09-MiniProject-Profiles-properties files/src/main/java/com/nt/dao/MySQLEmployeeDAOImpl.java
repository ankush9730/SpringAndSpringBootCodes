package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO-mysql")
@Profile({"dev","test","default"})
public  class MySQLEmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private  DataSource  ds;  //HAS-A property
	
	public MySQLEmployeeDAOImpl() {
    System.out.println("MySQLEmployeeDAOImpl:: 0-param constructor");
  }
	
	//SQL Query
	private  static final String   GET_EMPS_QUERY="SELECT ENO,ENAME,DESG,SALARY,DEPTNO FROM EMPLOYEE WHERE DESG IN(?,?,?) ORDER BY DESG";
    private   static final  String  INSERT_EMP_QUERY="INSERT INTO EMPLOYEE(ENAME,DESG,SALARY,DEPTNO) VALUES (?,?,?,?)";
	@Override
	public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception{
	  System.out.println("MySQLEmployeeDAOImpl.showEmployeesByDesgs()");
		System.out.println("DataSource object class name ::"+ds.getClass());
		 //write    jdbc code
		List<Employee> list=null;
		   // get pooled jdbc con 
		   //  get PreparedStatement object with pre-compiled SQL Query
		try(Connection con=ds.getConnection();
				PreparedStatement  ps=con.prepareStatement(GET_EMPS_QUERY);
				){
			       //set values  to query params
			      ps.setString(1, desg1);
			      ps.setString(2, desg2);
			      ps.setString(3, desg3);
			      // execute the SQL Query
			      try(ResultSet rs=ps.executeQuery()){
			    	  //process the ResultSet object to List<Employee> object
			    	  list=new ArrayList();
			    	  while(rs.next()) {
			    		  // copy  each record into  Model class obj
			    		  Employee  emp=new Employee();
			    		  emp.setEmpno(rs.getInt(1));
			    		  emp.setEname(rs.getString(2));
			    		  emp.setDesg(rs.getString(3));
			    		  emp.setSalary(rs.getDouble(4));
			    		  emp.setDeptno(rs.getInt(5));
			    		  //add  Employee class object to List Collection
			    		  list.add(emp);
			    	  }//while
			      }//nested try
		}//outer try
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		
		return list;
	}
	
	@Override
	public int insertEmployee(Employee emp) throws Exception {
	  System.out.println("MySQLEmployeeDAOImpl.insertEmployee()");
		try(//get Pooled jdbc con object
				Connection con=ds.getConnection();
				//create PreparedStatement object
				PreparedStatement ps=con.prepareStatement(INSERT_EMP_QUERY);
				){
			//set values to query params
			   ps.setString(1, emp.getEname());
			   ps.setString(2,emp.getDesg());
			   ps.setDouble(3, emp.getSalary());
			   ps.setInt(4, emp.getDeptno());
			   //execute  the SQL Query
			    int  count=ps.executeUpdate();
			    return  count;
		}//try
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
				
	}
	
	
	

}
