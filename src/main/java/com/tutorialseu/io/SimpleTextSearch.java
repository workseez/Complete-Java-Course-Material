package com.tutorialseu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleTextSearch {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file name
        System.out.print("Enter the name of the text file: ");
        String fileName = scanner.nextLine();

        // Ask the user for the search query
        System.out.print("Enter the word or phrase to search for: ");
        String searchQuery = scanner.nextLine();

        // Measure time for buffered stream
        long bufferedTime = searchUsingBufferedStream(fileName, searchQuery);

        // Measure time for unbuffered stream
        long unbufferedTime = searchUsingUnbufferedStream(fileName, searchQuery);

        // Compare and display the results
        System.out.println("\nTime Comparison:");
        System.out.println("Buffered Stream search time: " + bufferedTime + " milliseconds");
        System.out.println("Unbuffered Stream search time: " + unbufferedTime + " milliseconds");

        scanner.close();
    }

    public static long searchUsingBufferedStream(String fileName, String searchQuery) {
        long startTime = System.currentTimeMillis();  // Start time measurement
        int lineNumber = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nSearching with Buffered Stream:");

            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchQuery)) {
                    System.out.println("Found at line " + lineNumber + ": " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();  // End time measurement
        return endTime - startTime;  // Return the time taken
    }

    public static long searchUsingUnbufferedStream(String fileName, String searchQuery) {
        long startTime = System.currentTimeMillis();  // Start time measurement
        int lineNumber = 0;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName))) {
            int character;
            StringBuilder currentLine = new StringBuilder();
            System.out.println("\nSearching with Unbuffered Stream:");

            while ((character = reader.read()) != -1) {
                if (character == '\n') {
                    lineNumber++;
                    String line = currentLine.toString();
                    if (line.contains(searchQuery)) {
                        System.out.println("Found at line " + lineNumber + ": " + line);
                    }
                    currentLine = new StringBuilder();
                } else {
                    currentLine.append((char) character);
                }
            }

            // Check the last line if file doesn't end with a new line
            if (currentLine.length() > 0) {
                lineNumber++;
                String line = currentLine.toString();
                if (line.contains(searchQuery)) {
                    System.out.println("Found at line " + lineNumber + ": " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();  // End time measurement
        return endTime - startTime;  // Return the time taken
    }
}
