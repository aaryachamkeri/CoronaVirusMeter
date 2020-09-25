package com.cov19.main;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;



@SpringBootApplication

@ComponentScan({"com.cov19.controllers", "com.cov19.main"})
public class CoronaVirusMeterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusMeterApplication.class, args);


	}
	
	


}