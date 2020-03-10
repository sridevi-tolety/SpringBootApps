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

import com.example.demo.exceptions.UserNotFoundException;
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
		return "Say Hello   ....Hiiii!!!";
	}
	
		//JPA
	@GetMapping("/jpa/getemp")
	public List<Employee> jpagetEmployees() {
		return repository.findAll();
		//return service.getEmps();
	}
	
	@GetMapping("/jpa/getemp/{id}")
	public Optional<Employee> jpagetEmployeeById(@PathVariable Integer id) throws UserNotFoundException {
		Optional<Employee> emp = repository.findById(id);
		if(!emp.isPresent())
				throw new UserNotFoundException("User with id :"+id+" not found.");
		return emp;
		//return service.getEmps();
	}
	
}
