package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepository rep;
	
	public List<Employee> getEmps(){
		
		return rep.findAll();
	}
	
	public Employee saveEmp(Employee emp) {
		emp.setId(emp.getId()+1);
		return emp;		
	}

	
	
}
