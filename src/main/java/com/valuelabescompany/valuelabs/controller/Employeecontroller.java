package com.valuelabescompany.valuelabs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valuelabescompany.valuelabs.entity.Employee;
import com.valuelabescompany.valuelabs.service.Employeeservice;

@RestController
public class Employeecontroller {

	@Autowired
	Employeeservice employeeservice;

	@PostMapping("/save/employeee")
	public String saveEmployee(@RequestBody Employee employee) {
		employee.setJoiningdate(new Date());

		return employeeservice.saveEmployee(employee);
	}

	@GetMapping("/get/employee")
	public List<Employee> getEmployee() {
		List<Employee> employeelist = employeeservice.getEmployee();

		return employeelist;

	}
}
