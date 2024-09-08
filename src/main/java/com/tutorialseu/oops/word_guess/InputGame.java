package com.tutorialseu.oops.word_guess;

import java.util.Scanner;

// Single-level inheritance: Extending the basic game with input functionality
class InputGame extends Game {
    protected Scanner scanner; // Scanner object to read player input

    // Constructor to initialize the InputGame with the word to guess
    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.scanner = new Scanner(System.in);
    }

    // Override the playGame method to include input handling and checking guesses
    @Override
    public void playGame() {
        super.playGame();
        String userGuess = ""; // Variable to store the player's guess
        while (!userGuess.equalsIgnoreCase(wordToGuess)) {
            displayHint(); // Display the current hint
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextLine(); // Read the player's guess
            attempts++; // Increment the attempt counter
            if (userGuess.equalsIgnoreCase(wordToGuess)) {
                // If the guess is correct, congratulate the player
                System.out.println("Congratulations! You've guessed the word in " + attempts + " attempts.");
            } else {
                // If the guess is incorrect, prompt to try again
                System.out.println("Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord());
            }
        }
    }
}
