package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Employee;
import com.demo.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService emp2;

	@PostMapping(value = "/add")
	public Employee addEmp(@RequestBody Employee emp1) {

		Employee e = emp2.addEmployee(emp1);
		return e;

	}
	
	//get for get

}
