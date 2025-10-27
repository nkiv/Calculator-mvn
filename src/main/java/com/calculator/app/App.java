package com.calculator.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public void appLoop(Scanner scan) {
        String c = "y";
        while(c.toLowerCase().charAt(0) == 'y'){
            userInterface(scan);
            c = scan.next();
        }
        System.out.println("Exiting!");
    }

    public void userInterface(Scanner scan){
        int x;
        int y;
        double result = 0;
        String o;

        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator, lets do some math...");
        System.out.println("Operand 1: ");
        x = scan.nextInt();
        System.out.println("Operator: ");
        o = scan.nextLine();
        System.out.println("Operand 2: ");
        y = scan.nextInt();

        switch (o) {
            case "+":
                result = calculator.add(x, y);
                break;
            case "-":
                result = calculator.subtract(y, y);
                break;
            case "*":
                result = calculator.multiply(x, y);
                break;
            case "/":
                result = calculator.divide(x, y);
                break;
            default:
                System.out.println("Unknown math operator, please try again");
                result = Double.NEGATIVE_INFINITY;
                break;
        }
        System.out.println("Result:" + x + " " + o + " " + y + " = " + result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    }
}
