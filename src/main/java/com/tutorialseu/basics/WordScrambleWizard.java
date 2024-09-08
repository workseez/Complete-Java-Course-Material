package com.tutorialseu.basics;

import java.util.Scanner;
import java.util.Random;

public class WordScrambleWizard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Predefined list of words
        String[] wordList = {"magic", "wizard", "spell", "potion", "alchemy", "sorcery", "wand", "dragon", "cauldron", "broomstick"};

        int playerScore = 0;
        boolean keepPlaying = true;

        System.out.println("Welcome to Word Scramble Wizard!");
        System.out.println("Unscramble the magic words to score points!");

        // Game loop
        while (keepPlaying) {
            // Select a random word from the list and scramble it
            String word = wordList[random.nextInt(wordList.length)];
            String scrambledWord = scrambleWord(word, random);

            System.out.println("Scrambled word: " + scrambledWord);
            boolean wordGuessed = false;
            int attempts = 3;

            // Loop for player's attempts to guess the word
            while (attempts > 0 && !wordGuessed) {
                System.out.print("Your guess: ");
                String playerGuess = scanner.nextLine();

                if (playerGuess.equalsIgnoreCase(word)) {
                    System.out.println("Correct! You've unscrambled the word.");
                    playerScore++;
                    wordGuessed = true;
                } else {
                    attempts--;
                    System.out.println("Wrong! Attempts remaining: " + attempts);
                }
            }

            if (!wordGuessed) {
                System.out.println("The correct word was: " + word);
            }

            System.out.println("Your current score: " + playerScore);

            // Ask if the player wants to continue
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine();
            keepPlaying = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score: " + playerScore);
        scanner.close();
    }

    // Method to scramble a word
    public static String scrambleWord(String word, Random random) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}
