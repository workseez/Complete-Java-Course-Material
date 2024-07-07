package com.tutorialseu.basics;

import java.util.Scanner;

public class NumberOfDigits {

    // Recursive method to count digits
    public static int countDigits(int number) {
        // Base case: if the number is less than 10, it has only one digit
        if (number < 10) {
            return 1;
        } else {
            // Recursive case: divide the number by 10 and count digits of the quotient
            return 1 + countDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Close the scanner after input
        scanner.close();

        // Calculate number of digits using recursion
        int digits = countDigits(num);

        // Output the result
        System.out.println("Number of digits in " + num + " is: " + digits);
    }
}

