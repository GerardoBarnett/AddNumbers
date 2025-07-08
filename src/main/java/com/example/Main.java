package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Example usage
        double num1 = 10.5;
        double num2 = 20.7;
        double result = calculator.sum(num1, num2);
        
        System.out.printf("The sum of %.2f and %.2f is: %.2f%n", num1, num2, result);
    }
}