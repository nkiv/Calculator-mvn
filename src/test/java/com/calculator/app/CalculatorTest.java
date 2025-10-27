package com.calculator.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(11, 11);
        assertEquals(121, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(4, 2);
        assertEquals(2, result);
        result = calculator.divide(1, 2);
        assertEquals(.5, result);
    }

    @Test
    public void testPower() {
        int result = calculator.power(4, 2);
        assertEquals(16, result);
        result = calculator.power(4, 3);
        assertEquals(64, result);
        result = calculator.power(2, 8);
        assertEquals(256, result);
    }
}
