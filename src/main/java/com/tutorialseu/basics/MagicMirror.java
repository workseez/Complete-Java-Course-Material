package com.tutorialseu.basics;

import java.util.Scanner;

public class MagicMirror {

    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string is empty or has one character, return the string
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Recursive case: take the last character and add it to the reversed rest of the string
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.println("Enter a string to reflect in the magic mirror:");
        String inputString = scanner.nextLine();

        // Reverse the string using the recursive method
        String reversedString = reverseString(inputString);

        // Print the reversed string
        System.out.println("The magic mirror reflects: " + reversedString);

        scanner.close();
    }
}
