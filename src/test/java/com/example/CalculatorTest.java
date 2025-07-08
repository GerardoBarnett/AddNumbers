package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

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
}