package com.tutorialseu.oops.dice;

import java.util.Random;

class Dice {
    private int value;

    // Default Constructor
    public Dice() {
        this.value = 1;  // Initialize dice with value 1
    }

    // Method to roll the dice
    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;  // Generate a random number between 1 and 6
    }

    // Method to get the value of the dice
    public int getValue() {
        return this.value;
    }
}
