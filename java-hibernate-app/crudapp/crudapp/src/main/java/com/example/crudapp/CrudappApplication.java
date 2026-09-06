package com.example.crudapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}


	@Bean
	public CommandLineRunner clr(String[] args) {
		return runner -> {
			System.out.println("Hello World");
		};

	}
}
