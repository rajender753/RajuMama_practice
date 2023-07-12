package com.valuelabescompany.valuelabs.dto;

import java.util.Date;

public class EmployeeDto {
    Integer empId;
	
	
	String empName;
	
	
	Integer salary;
	
	
	Date joiningdate;
	
	
	String projectname;
	
	
	String reportingmanager;


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public Date getJoiningdate() {
		return joiningdate;
	}


	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}


	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public String getReportingmanager() {
		return reportingmanager;
	}


	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	


	public EmployeeDto() {
		
	}


	public EmployeeDto(Integer empId, String empName, Integer salary, Date joiningdate, String projectname,
			String reportingmanager) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.joiningdate = joiningdate;
		this.projectname = projectname;
		this.reportingmanager = reportingmanager;
	}
	
	
	
	
	

}
