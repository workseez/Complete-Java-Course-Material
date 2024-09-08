package com.tutorialseu.oops.dice;

import java.util.Scanner;

public class LuckyDiceAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Lucky Dice Adventure!");
        System.out.print("Enter the target score to win: ");
        int targetScore = scanner.nextInt();

        Game game = new Game(targetScore);

        boolean playing = true;
        while (playing) {
            System.out.println("Press 'r' to roll the dice, 's' to stop:");
            char choice = scanner.next().charAt(0);
            if (choice == 'r') {
                game.rollDice();
                game.displayScore();
                if (game.isTargetReached()) {
                    System.out.println("Congratulations! You've reached the target score!");
                    playing = false;
                }
            } else if (choice == 's') {
                System.out.println("You chose to stop. Final Score: ");
                game.displayScore();
                playing = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
