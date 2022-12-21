package com.demo.calculator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatordemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatordemoApplication.class, args);
	}

	public int multiply(int a, int b) {
		return a*b;
	}
}
