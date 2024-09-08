package com.tutorialseu.oops;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Display library");
            System.out.println("3. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                // Add a book
                Book book = new Book();

                System.out.print("Enter book title: ");
                book.title = scanner.nextLine();

                System.out.print("Enter book author: ");
                book.author = scanner.nextLine();

                System.out.print("Enter number of pages: ");
                book.numPages = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                library.addBook(book);
                System.out.println("Book added successfully!");

            } else if (choice == 2) {
                // Display library
                library.printLibrary();

            } else if (choice == 3) {
                // Quit
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
