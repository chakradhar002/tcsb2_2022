package com.demo.employees;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.employees.controllers.EmployeeController;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class EmployeesApplicationTests {

	@Test
	public void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}
}
