package com.demo.employees.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.employees.controllers.EmployeeController;
import com.demo.employees.model.Employee;
import com.demo.employees.services.EmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class StandaloneControllerTests {

	@MockBean
	EmployeeService employeeService;

	@Autowired
	MockMvc mockMvc;
      // write a test call api
	@Test
	public void testfindAll() throws Exception {
		Employee employee = new Employee("Lokesh", "Gupta");
		List<Employee> employees = Arrays.asList(employee);

		Mockito.when(employeeService.findAll()).thenReturn(employees);

		mockMvc.perform(get("/employee"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0].firstName", Matchers.is("Lokesh")));
	}
	
	
	
	
	@Test
	public void testfindById() throws Exception {
		
	}
	
	@Test
	public void testdeleteById() throws Exception {
		
	}
	
	@Test
	public void testdeleteAll() throws Exception {
		
	}
	
	@Test
	public void testUpdateById() throws Exception {
		
	}

}
