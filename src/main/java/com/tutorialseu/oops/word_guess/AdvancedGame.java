package com.tutorialseu.oops.word_guess;

import java.util.Random;

// Multilevel inheritance: Adding advanced hint features
class AdvancedGame extends InputGame {
    private Random random; // Random object to generate random numbers

    // Constructor to initialize the AdvancedGame with the word to guess
    public AdvancedGame(String wordToGuess) {
        super(wordToGuess);
        this.random = new Random();
    }

    // Override the displayHint method to provide advanced hints
    @Override
    public void displayHint() {
        super.displayHint();
        if (attempts > 0) {
            revealRandomLetter(); // Reveal a random letter
            System.out.println("Revealed so far: " + getRevealedWord());
        }
    }

    // Method to reveal a random letter from the word
    private void revealRandomLetter() {
        int index;
        do {
            index = random.nextInt(wordToGuess.length()); // Generate a random index
        } while (revealedLetters[index] != '-'); // Ensure the letter at this index has not been revealed
        revealedLetters[index] = wordToGuess.charAt(index); // Reveal the letter at the generated index
    }
}
