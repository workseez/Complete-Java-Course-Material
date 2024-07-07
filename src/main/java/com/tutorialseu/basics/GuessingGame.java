package com.tutorialseu.basics;

// Import necessary classes
import java.util.Scanner;

public class GuessingGame {

    // Method to start the guessing game
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Explain the game to the user
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it based on your feedback.");

        // Define the range of numbers
        int low = 1;
        int high = 100;

        // Variable to track whether the game is still going
        boolean correct = false;

        // Loop until the correct number is guessed
        while (!correct) {
            // Calculate the middle of the current range
            int guess = low + (high - low) / 2;

            // Ask the user for feedback
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'h' if your number is higher, 'l' if it is lower, or 'c' if it is correct.");
            char feedback = scanner.next().charAt(0);

            // Process the feedback
            if (feedback == 'h') {
                // If the user's number is higher, adjust the low end of the range
                low = guess + 1;
            } else if (feedback == 'l') {
                // If the user's number is lower, adjust the high end of the range
                high = guess - 1;
            } else if (feedback == 'c') {
                // If the guess is correct, end the game
                correct = true;
                System.out.println("I guessed your number! It is " + guess + ".");
            } else {
                // If the input is invalid, ask again
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
