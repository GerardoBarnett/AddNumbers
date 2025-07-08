package com.example;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Example usage
        double num1 = 10.5;
        double num2 = 20.7;
        double result = calculator.sum(num1, num2);
        
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info("The sum of %.2f and %.2f is: %.2f".formatted(num1, num2, result));
        }
    }
}