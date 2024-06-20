package com.tutorialseu.basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 'y';
        do {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }
            System.out.println("The result is: " + result);
            System.out.println("Do you want to perform another calculation? (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}

