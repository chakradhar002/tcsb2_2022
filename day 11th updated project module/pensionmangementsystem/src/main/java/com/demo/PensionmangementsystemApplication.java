package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PensionmangementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionmangementsystemApplication.class, args);
	}

}
