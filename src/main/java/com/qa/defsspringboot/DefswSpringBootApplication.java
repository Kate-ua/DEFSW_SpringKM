package com.qa.defsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class DefswSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefswSpringBootApplication.class, args);
	}

}
