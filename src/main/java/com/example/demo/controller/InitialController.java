package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;



@RestController
public class InitialController {
	
	@Autowired 
	private EmployeeService service;
	
	@Autowired 
	private EmployeeRepository repository;
	
	@RequestMapping("/sayhi")
	public String sayHi() {
		return "Say Hi";
	}
	
		//JPA
	@GetMapping("/jpa/getemp")
	public List<Employee> jpagetEmployees() {
		return repository.findAll();
		//return service.getEmps();
	}
	
	}
