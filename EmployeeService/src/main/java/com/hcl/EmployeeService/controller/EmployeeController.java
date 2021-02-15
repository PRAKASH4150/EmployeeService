package com.hcl.EmployeeService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.EmployeeService.appexception.NotFoundException;
import com.hcl.EmployeeService.entity.Employee;
import com.hcl.EmployeeService.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/findbyid/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") long empId) throws NumberFormatException
	{
		Optional<Employee>employeeOptional=employeeService.findEmployeeById(empId);
		
		if(employeeOptional.isPresent())
		{
			return new ResponseEntity<>(employeeOptional.get(),new HttpHeaders(),HttpStatus.OK);
		}
		else
		{
			throw new NotFoundException();
		}
	}
}
