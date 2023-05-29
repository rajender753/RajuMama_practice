package com.valuelabescompany.valuelabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valuelabescompany.valuelabs.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
