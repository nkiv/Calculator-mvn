package com.calculator.app;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int power(int a, int b) {
        int result = a;
        for (int i = 1; i < b; ++i) {
            result *= a;
        }
        return result;
    }

    public double sqrt(double a) {
        double x = a / 2.0;  // Initial guess

        // More iterations mean better precision
        for (int i = 0; i < 4; i++) {
            x = 0.5 * (x + a / x);  // Newton's formula
        }

        return x;
    }
}
