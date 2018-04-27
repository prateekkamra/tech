package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.model.Employee;
import com.test.repository.EmployeeRepository;

public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		empRepository.findAll();
		return empList;
	}

	public Employee getEmployee(@PathVariable int id) {
		return new Employee();
	}
	
}
