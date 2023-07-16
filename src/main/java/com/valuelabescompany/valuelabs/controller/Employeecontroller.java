package com.valuelabescompany.valuelabs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valuelabescompany.valuelabs.dto.EmployeeDto;
import com.valuelabescompany.valuelabs.dto.ValueLabsResponse;
import com.valuelabescompany.valuelabs.entity.Employee;
import com.valuelabescompany.valuelabs.service.Employeeservice;

@RestController
public class Employeecontroller {

	@Autowired
	Employeeservice employeeservice;

	// this is for save employee
	@PostMapping("/save/employeee")
	public ValueLabsResponse saveEmployee(@RequestBody EmployeeDto employeeDto) {

		ValueLabsResponse response = new ValueLabsResponse();
		
		List<String> errors = new ArrayList<>();

		// validations
		if (employeeDto.getEmpId() == null) {
			errors.add("Employee Id is Mandatory");
		}
		if (employeeDto.getEmpName() == null) {
			errors.add("Employee Name is Mandatory");
		}
		if(employeeDto.getReportingmanager() == null) {
			errors.add("Reporting Manager is Mandatory");
		}
		/*
		 * if List of errors size is greater then zero it means request has erros return
		 * error response
		 */

		if (errors.size() > 0) {
			response.setStatus(500);
			response.setMessage("Please fill all mandatory fields");
			response.setResponseBody(errors);
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

		employeeservice.saveEmployee(employee);
		response.setStatus(200);
		response.setMessage("Employee saved Successfully");
		return response;

	}

	@GetMapping("/get/employee")
	public List<Employee> getEmployee() {
		List<Employee> employeelist = employeeservice.getEmployee();

		return employeelist;

	}
}
