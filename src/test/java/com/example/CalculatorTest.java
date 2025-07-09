package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        // Test positive numbers
        assertEquals(5.0, calculator.sum(2.0, 3.0), 0.0001);
        
        // Test negative numbers
        assertEquals(-5.0, calculator.sum(-2.0, -3.0), 0.0001);
        
        // Test positive and negative numbers
        assertEquals(1.0, calculator.sum(3.0, -2.0), 0.0001);
        
        // Test with zero
        assertEquals(3.0, calculator.sum(3.0, 0.0), 0.0001);
        
        // Test with decimals
        assertEquals(3.14159, calculator.sum(3.0, 0.14159), 0.0001);
    }

    /**
     * Test sum method with very large numbers.
     * This tests the edge case of using values near Double.MAX_VALUE,
     * which could potentially cause overflow issues.
     */
    @Test
    public void testSumWithVeryLargeNumbers() {
        double result = calculator.sum(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result, 0);
    }

    /**
     * Tests the sum method with two positive numbers.
     * Verifies that the method correctly adds the two numbers and returns their sum.
     */
    @Test
    public void test_sum_1() {
        double result = calculator.sum(2.0, 3.0);
        assertEquals(5.0, result, 0.0001);
    }
}
