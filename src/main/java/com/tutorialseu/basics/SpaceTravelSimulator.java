package com.tutorialseu.basics;

import java.util.Scanner;

public class SpaceTravelSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store astronaut details
        String[] astronautNames = new String[10]; // Assuming maximum 10 astronauts
        int[] astronautAges = new int[10];
        String[] missionStatus = new String[10];

        int numAstronauts = 0; // Variable to track number of astronauts

        // Main loop for managing astronaut operations
        while (true) {
            // Display menu options
            System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Process user choice
            switch (choice) {
                case 1:
                    // Add astronaut to mission
                    System.out.print("Enter astronaut's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter astronaut's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter initial mission status (On mission / Available): ");
                    String status = scanner.nextLine();

                    // Store astronaut details in arrays
                    astronautNames[numAstronauts] = name;
                    astronautAges[numAstronauts] = age;
                    missionStatus[numAstronauts] = status;
                    numAstronauts++;

                    System.out.println(name + " added to the mission.");
                    break;

                case 2:
                    // Update astronaut's mission status
                    System.out.print("Enter astronaut's name to update status: ");
                    String astronautName = scanner.nextLine();
                    boolean found = false;

                    // Search for astronaut by name and update status
                    for (int i = 0; i < numAstronauts; i++) {
                        if (astronautNames[i].equalsIgnoreCase(astronautName)) {
                            System.out.print("Enter new mission status (On mission / Available): ");
                            String newStatus = scanner.nextLine();
                            missionStatus[i] = newStatus;
                            System.out.println("Mission status updated for " + astronautName);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Astronaut not found in the mission.");
                    }
                    break;

                case 3:
                    // Display all astronauts
                    System.out.println("All Astronauts:");
                    if (numAstronauts == 0) {
                        System.out.println("No astronauts added to the mission yet.");
                    } else {
                        for (int i = 0; i < numAstronauts; i++) {
                            System.out.println("Name: " + astronautNames[i] + ", Age: " + astronautAges[i] + ", Status: " + missionStatus[i]);
                        }
                    }
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }

            System.out.println(); // For better readability
        }
    }
}
