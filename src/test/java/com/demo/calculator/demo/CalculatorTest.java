package com.demo.calculator.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

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
