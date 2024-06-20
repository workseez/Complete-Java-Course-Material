package com.tutorialseu.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private static final ArrayList<String> tasks = new ArrayList<>();
    private static final ArrayList<Boolean> isCompleted = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nTo-Do List Application");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Mark a task as completed");
        System.out.println("4. Remove a task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        isCompleted.add(false);
        System.out.println("Task added.");
    }

    private static void viewTasks() {
        System.out.println("\nTo-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            String status = isCompleted.get(i) ? "Completed" : "Pending";
            System.out.println((i + 1) + ". " + tasks.get(i) + " [" + status + "]");
        }
    }

    private static void markTaskCompleted(Scanner scanner) {
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            isCompleted.set(taskNumber - 1, true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Enter the task number to remove: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            isCompleted.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

