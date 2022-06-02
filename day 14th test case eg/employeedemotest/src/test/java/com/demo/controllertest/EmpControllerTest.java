package com.demo.controllertest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.demo.bean.Employee;

import junit.framework.Assert;



@SpringBootTest
public class EmpControllerTest {

	@Test
	public void testAddEmp() {

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:8087/add";

		Employee emp = new Employee("ram", "kumar");

		ResponseEntity<Employee> enitity = restTemplate.postForEntity(url, emp, Employee.class);

	//	Assertions.assertThat(restTemplate.postForLocation(", enitity.getStatusCode()));

	}
	
	
	
	@Test
	public void testgetEmp() {

		

	}

}
