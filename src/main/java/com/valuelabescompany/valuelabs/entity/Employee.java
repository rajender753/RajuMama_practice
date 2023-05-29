package com.valuelabescompany.valuelabs.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empid")
	Integer empId;
	
	@Column(name="empname")
	String empName;
	
	@Column(name="empsalary")
	Integer salary;
	
	@Column(name="empjoiningdate")
	Date joiningdate;
	
	@Column(name="projectname")
	String projectname;
	
	@Column(name="reportingmanager")
	String reportingmanager;
	
	

	public Employee() {
		
	}



	public Employee(Integer empId, String empName, Integer salary, Date joiningdate, String projectname,
			String reportingmanager) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.joiningdate = joiningdate;
		this.projectname = projectname;
		this.reportingmanager = reportingmanager;
	}



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
	
	
	
	
	

}
