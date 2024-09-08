package com.tutorialseu.oops.word_guess;

// Base class for the game
class Game {
    // The word that the player needs to guess
    protected String wordToGuess;
    // Number of attempts made by the player
    protected int attempts;
    // Array to track revealed letters
    protected char[] revealedLetters;

    // Constructor to initialize the game with the word to guess
    public Game(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.attempts = 0;
        this.revealedLetters = new char[wordToGuess.length()];
        // Initialize the revealedLetters array with dashes
        for (int i = 0; i < revealedLetters.length; i++) {
            revealedLetters[i] = '-';
        }
    }

    // Method to start the game and display a welcome message
    public void playGame() {
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("You will be given hints to guess the word.");
    }

    // Method to display a basic hint about the word length
    public void displayHint() {
        System.out.println("Hint: The word has " + wordToGuess.length() + " letters.");
    }

    // Method to get the current state of the revealed word
    public String getRevealedWord() {
        return new String(revealedLetters);
    }
}
