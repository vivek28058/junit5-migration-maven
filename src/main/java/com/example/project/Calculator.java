package com.example.project;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example usage: Add 5 and 7
        int result = calculator.add(5, 7);

        // Print the result
        System.out.println("Result: " + result);
    }
}
