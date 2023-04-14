package org.example.calc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Welcome the user and ask for two numbers
        System.out.println("Welcome!  I'll add two numbers, but first,");
        System.out.print("What is your name?  ");

        // First, ask for name, to be polite
        Scanner consoleInput = new Scanner(System.in);
        String name = consoleInput.nextLine();
        System.out.println("Good to be working with you, " + name);

        System.out.print("Enter a number: ");
        double number1 = consoleInput.nextDouble();
        System.out.println("Number 1: " + number1);

        System.out.print("Enter another number: ");
        double number2 = consoleInput.nextDouble();
        System.out.println("Number 2: " + number2);
        // clean up the input buffer
        // consoleInput.nextLine();

        boolean badInput = false;

        do {
            System.out.print("Please enter one of {add, subtract, multiply, divide}");
            String op = consoleInput.next();

            if (op.equalsIgnoreCase("add")) {
                // Add them
                doAdd(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("subtract")) {
                // Subtract them
                doSubtract(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("divide")) {
                // Divide them
                doDivide(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("multiply")) {
                // Divide them
                doMultiply(number1, number2);
                break;
            } else {
                System.out.println("I didn't understand that.... Please try again ");
                badInput = true;
            }
        } while (badInput);
    }

    private static void doDivide(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("result is "  + result);
    }

    static void doAdd(double number1, double number2){
        double result = number1 + number2;
        System.out.println("result is " + result);
    }
    static void doSubtract(double number1, double number2){
        double result = number1 - number2;
        System.out.println("result is " + result);
    }
    static void doMultiply(double number1, double number2){
        double result = number1 / number2;
        System.out.println("result is " + result);
    }
}
