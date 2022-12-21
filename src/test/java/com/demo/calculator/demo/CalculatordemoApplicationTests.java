package com.demo.calculator.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatordemoApplicationTests {

	@Test
	void contextLoads() {
	}

	Calculator calculator;

	@Test
	public void multiplyTest() {
		calculator = new Calculator();
		assertEquals(16, calculator.multiply(4,4));
		assertEquals(25, calculator.multiply(5,5));
		assertEquals(36, calculator.multiply(6,6));
		assertEquals(49, calculator.multiply(7,7));
	}

}
