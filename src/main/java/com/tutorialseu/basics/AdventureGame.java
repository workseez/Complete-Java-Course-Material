package com.tutorialseu.basics;

import java.util.Scanner;  // Import the Scanner class to read input

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        // Introduction to the game
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely!");

        // Present the first choice to the player
        System.out.println("You are at a crossroad. Do you want to go left or right?");
        System.out.print("Type 'left' or 'right': ");
        String choice1 = scanner.nextLine().toLowerCase();  // Read the player's choice and convert to lowercase

        // First level of decision-making based on the player's choice
        switch (choice1) {
            case "left":
                // Scenario for choosing the left path
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.print("Type 'enter' or 'walk': ");
                String choice2 = scanner.nextLine().toLowerCase();  // Read the player's choice

                // Second level of decision-making based on the player's choice in the cave scenario
                switch (choice2) {
                    case "enter":
                        // Scenario for entering the cave
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.print("Type 'fight' or 'sneak': ");
                        String choice3 = scanner.nextLine().toLowerCase();  // Read the player's choice

                        // Third level of decision-making based on the player's choice in the dragon scenario
                        switch (choice3) {
                            case "fight":
                                // Scenario for fighting the dragon
                                System.out.println("You bravely fight the dragon and...");
                                System.out.println("You are victorious! The dragon guards the treasure. You win!");
                                break;
                            case "sneak":
                                // Scenario for sneaking past the dragon
                                System.out.println("You sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            default:
                                // Invalid choice handling
                                System.out.println("Invalid choice. You got caught by the dragon and lost.");
                        }
                        break;
                    case "walk":
                        // Scenario for walking past the cave
                        System.out.println("You walk past the cave and fall into a hidden trap. Game over.");
                        break;
                    default:
                        // Invalid choice handling
                        System.out.println("Invalid choice. You got lost in the wilderness. Game over.");
                }
                break;
            case "right":
                // Scenario for choosing the right path
                System.out.println("You walk through a dense forest and find a river.");
                System.out.println("Do you want to swim across or build a raft?");
                System.out.print("Type 'swim' or 'raft': ");
                String choice2b = scanner.nextLine().toLowerCase();  // Read the player's choice

                // Second level of decision-making based on the player's choice in the river scenario
                switch (choice2b) {
                    case "swim":
                        // Scenario for swimming across the river
                        System.out.println("You swim across the river and encounter a wild bear!");
                        System.out.println("Do you want to run away or climb a tree?");
                        System.out.print("Type 'run' or 'climb': ");
                        String choice3b = scanner.nextLine().toLowerCase();  // Read the player's choice

                        // Third level of decision-making based on the player's choice in the bear scenario
                        switch (choice3b) {
                            case "run":
                                // Scenario for running away from the bear
                                System.out.println("You run away safely and find a hidden path to the treasure. You win!");
                                break;
                            case "climb":
                                // Scenario for climbing the tree
                                System.out.println("You climb the tree, but the bear waits for you. You are stuck. Game over.");
                                break;
                            default:
                                // Invalid choice handling
                                System.out.println("Invalid choice. The bear catches you. Game over.");
                        }
                        break;
                    case "raft":
                        // Scenario for building a raft
                        System.out.println("You build a raft and safely cross the river. You find the treasure on the other side. You win!");
                        break;
                    default:
                        // Invalid choice handling
                        System.out.println("Invalid choice. You got swept away by the river. Game over.");
                }
                break;
            default:
                // Invalid choice handling for the first level
                System.out.println("Invalid choice. You got lost in the wilderness. Game over.");
        }

        scanner.close();  // Close the Scanner object
    }
}
