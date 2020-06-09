package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	
@Autowired
EmployeeRepository repo;
	
@GetMapping(path="/employees",produces= {"application/json"})
@ResponseBody
public List<Employee> getEmployees() {
	return (List<Employee>) repo.findAll();
}

@PostMapping("/saveemployee") 
public Employee saveEmployee(@RequestBody Employee employee) {
	repo.save(employee);
	return employee;
}

}
