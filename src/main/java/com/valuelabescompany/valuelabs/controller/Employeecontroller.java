package com.valuelabescompany.valuelabs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valuelabescompany.valuelabs.dto.EmployeeDto;
import com.valuelabescompany.valuelabs.entity.Employee;
import com.valuelabescompany.valuelabs.service.Employeeservice;

@RestController
public class Employeecontroller {

	@Autowired
	Employeeservice employeeservice;

	// this is for save employee
	@PostMapping("/save/employeee")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
		
		//validations 
		if(employeeDto.getEmpId() == null) {
			return "Employee Id Mandatory";
		}
		
		
		Employee employee = new Employee();
		
		employee.setEmpId(employeeDto.getEmpId());
		employee.setEmpName(employeeDto.getEmpName());
		employee.setProjectname(employeeDto.getProjectname());
		employee.setReportingmanager(employeeDto.getReportingmanager());
		employee.setSalary(employeeDto.getSalary());
		employee.setJoiningdate(new Date());
		
//		printing Address
		System.out.println(employeeDto.getAddressDto());
		
		
		return employeeservice.saveEmployee(employee);
	}

	@GetMapping("/get/employee")
	public List<Employee> getEmployee() {
		List<Employee> employeelist = employeeservice.getEmployee();

		return employeelist;

	}
}
