package com.tutorialseu.basics;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        // Problem Statement:
        // Given a square matrix 'mat', return the sum of the matrix diagonals.
        // Only include the sum of all the elements on the primary diagonal and
        // all the elements on the secondary diagonal that are not part of the primary diagonal.

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the size of the matrix
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();

        // Step 2: Declare and initialize the matrix
        int[][] mat = new int[n][n];

        // Step 3: Read the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Initialize the sum of diagonals
        int sum = 0;

        // Step 5: Calculate the sum of the primary diagonal
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }

        // Step 6: Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            // Avoid counting the middle element twice in case of an odd-sized matrix
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        // Step 7: Output the result
        System.out.println("The sum of the primary and secondary diagonals is: " + sum);
    }
}
