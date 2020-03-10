package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exceptions.UserNotFoundException;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex , WebRequest req) {
		
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
		
	}

}
