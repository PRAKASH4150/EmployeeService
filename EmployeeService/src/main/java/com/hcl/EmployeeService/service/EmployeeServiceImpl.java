package com.hcl.EmployeeService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.EmployeeService.entity.Employee;
import com.hcl.EmployeeService.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Optional<Employee> findEmployeeById(long empId) {
		
		return employeeRepository.findById(empId);
		
	}

}
