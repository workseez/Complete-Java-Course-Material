package com.tutorialseu.oops.word_guess;

import java.util.Random;

// Main class to run the game
public class WordGuessingGame {

    public static void main(String[] args) {
        // Define a pool of words to choose from
        String[] wordPool = {"inheritance", "polymorphism", "encapsulation", "abstraction", "interface"};
        Random random = new Random();
        // Randomly select a word from the pool
        String wordToGuess = wordPool[random.nextInt(wordPool.length)];
        AdvancedGame game = new AdvancedGame(wordToGuess); // Create an instance of AdvancedGame
        game.playGame(); // Start the game
    }
}