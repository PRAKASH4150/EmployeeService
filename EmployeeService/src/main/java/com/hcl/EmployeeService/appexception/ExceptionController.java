package com.hcl.EmployeeService.appexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	 @ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Object> exceptionOne(NotFoundException exception) 
	{
		 return new ResponseEntity<>("Invalid Employee ID", HttpStatus.NOT_FOUND);
	}
	 
	 @ExceptionHandler(value=NumberFormatException.class)
	 public ResponseEntity<Object> exceptionTwo(NumberFormatException exception)
	 {
		 return new ResponseEntity<>("Invalid Input.Enter only numbers",HttpStatus.CONFLICT);
	 }
	
}
