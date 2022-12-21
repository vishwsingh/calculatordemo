package com.demo.calculator.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatordemoApplicationTests {

	@Test
	void contextLoads() {
	}

	//Calculator calculator;

	@Test
	public void multiplyTest() {
	//	calculator = new Calculator();
		assertEquals(16, CalculatordemoApplication.multiply(4,4));
		assertEquals(25, CalculatordemoApplication.multiply(5,5));
		assertEquals(36, CalculatordemoApplication.multiply(6,6));
		assertEquals(49, CalculatordemoApplication.multiply(7,7));
		assertEquals(64, CalculatordemoApplication.multiply(8,8));
	}

}
