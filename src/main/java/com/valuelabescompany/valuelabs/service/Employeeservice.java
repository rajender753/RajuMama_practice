package com.valuelabescompany.valuelabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valuelabescompany.valuelabs.entity.Employee;
import com.valuelabescompany.valuelabs.repository.EmployeeRepository;

@Service
public class Employeeservice {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public String saveEmployee(Employee employee) {
		employeerepository.save(employee);
		
		return "save employee i did good job";
		
	}
	public List<Employee> getEmployee(){
		List<Employee> employeelist=employeerepository.findAll();
		return employeelist;
		
		
	}

}
