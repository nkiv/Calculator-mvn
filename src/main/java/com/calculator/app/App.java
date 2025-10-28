package com.calculator.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void appLoop(Scanner scan) {
        String c = "y";
        while (c.toLowerCase().charAt(0) == 'y') {
            userInterface(scan);
            System.out.println("Continue? (y/n)");
            c = scan.next();
        }
        System.out.println("Exiting!");
    }

    public static void userInterface(Scanner scan) {
        int x;
        int y;
        double result = 0;
        String o;

        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator, lets do some math...");
        System.out.println("Operand 1: ");
        x = scan.nextInt();
        System.out.println("Operator: ");
        o = scan.next();
        System.out.println("Operand 2: ");
        y = scan.nextInt();

        switch (o) {
            case "+" ->
                result = calculator.add(x, y);
            case "-" ->
                result = calculator.subtract(x, y);
            case "*" ->
                result = calculator.multiply(x, y);
            case "/" ->
                result = calculator.divide(x, y);
            case "^" ->
                result = calculator.power(x, y);
            default -> {
                System.out.println("Unknown math operator, please try again");
                result = Double.NEGATIVE_INFINITY;
            }
        }

        System.out.println("Result:\n" + x + " " + o + " " + y + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        appLoop(scan);
    }
}
