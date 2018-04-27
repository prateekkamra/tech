package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;
import com.test.service.EmployeeService;

@RestController
public class Test1Controller {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/getTest")
	public String getMessage() {
		return "this is a message from Test1.";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return empService.getEmployee(id);
	}
	
}
