package com.example.schools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SchoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolsApplication.class, args);
	}

}
