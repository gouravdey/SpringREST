package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(RestApplication.class, args);
		EmployeeUI employeeUI = ac.getBean(EmployeeUI.class);
	}

}
