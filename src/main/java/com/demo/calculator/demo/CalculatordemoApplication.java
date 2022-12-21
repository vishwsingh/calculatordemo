package com.demo.calculator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatordemoApplication {

	public static void mamvnin(String[] args) {
		SpringApplication.run(CalculatordemoApplication.class, args);
		multiply(4,5);
	}
	public static int multiply(int a, int b) {
		return a*b;
	}

}
