package com.tutorialseu.oops;

public class Library {
    // Member variables
    Book[] books;
    int bookCount;

    // Initialize the books array with a maximum of 10 books for simplicity
    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more books can be added.");
        }
    }

    // Method to print all books in the library
    public void printLibrary() {
        for (int i = 0; i < bookCount; i++) {
            books[i].printBookDetails();
            System.out.println(); // Print a blank line between books
        }
    }
}
