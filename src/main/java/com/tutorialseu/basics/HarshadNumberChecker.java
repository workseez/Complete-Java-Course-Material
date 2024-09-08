package com.tutorialseu.basics;

import java.util.Scanner;
public class HarshadNumberChecker {

    public static void main(String[] args) {
        // Declaring Scanner
        Scanner in = new Scanner(System.in);
        int x;

        //Taking input from the user
        System.out.println("Enter a number:");
        x = in.nextInt();


        // Store the original number for later comparison
        int originalNumber = x;
        int sumOfDigits = 0;

        // Calculate the sum of digits of x
        while (x > 0) {
            sumOfDigits += x % 10; // Extract the last digit and add to sumOfDigits
            x /= 10; // Remove the last digit from x
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println("The number is a Harshad number");
        } else {
            System.out.println("The number is not a Harshad number");
        }
    }
}
