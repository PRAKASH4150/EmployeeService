package com.hcl.EmployeeService.service;

import java.util.Optional;

import com.hcl.EmployeeService.entity.Employee;

public interface EmployeeService {

	public Optional<Employee> findEmployeeById(long empId);
}
