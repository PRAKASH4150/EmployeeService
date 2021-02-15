package com.hcl.EmployeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.EmployeeService.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}
