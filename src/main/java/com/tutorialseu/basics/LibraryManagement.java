package com.tutorialseu.basics;

public class LibraryManagement {

    public static int getNumberOfBooks(int[] bookQuantities){
        int sum = 0;
        for(int quantity: bookQuantities){
            sum+=quantity;
        }

        return sum; //Return value here
    }

    public static double getTotalInventoryValue(int[] bookQuantities, double[] bookPrices){
        double totalPrice = 0.0;

        for(int i=0; i<bookQuantities.length;i++){
            totalPrice+=bookQuantities[i]*bookPrices[i];
        }

        return totalPrice; //Return value here
    }

    public static void main(String[] args) {
        // Variables and Data types
        String[] bookNames = new String[5]; // Array to store book names
        int[] bookQuantities = new int[5]; // Array to store book quantities
        double[] bookPrices = new double[5]; // Array to store book price


        //TODO: Initialize the bookNames
        bookNames[0] = "The Midnight Library by Matt Haig";
        bookNames[1] = "Where the Crawdads Sing";
        bookNames[2] = "Becoming by Michelle Obama";
        bookNames[3] = "Educated by Tara Westover";
        bookNames[4] = "The Silent Patient by Alex Michaelides";

        //TODO: Initialize the bookQuantities
        bookQuantities[0] = 2;
        bookQuantities[1] = 4;
        bookQuantities[2] = 6;
        bookQuantities[3] = 1;
        bookQuantities[4] = 7;

        //TODO: Initialize the bookPrices
        bookPrices[0] = 15.99;
        bookPrices[1] = 18.99;
        bookPrices[2] = 22.50;
        bookPrices[3] = 14.95;
        bookPrices[4] = 16.75;

        // Printing the details of each book
        System.out.println("Book Inventory Details:");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.println("Book Name: " + bookNames[i]);
            System.out.println("Quantity: " + bookQuantities[i]);
            System.out.println("Price per Book: $" + bookPrices[i]);
            System.out.println("Total Value: $" + (bookQuantities[i] * bookPrices[i]));
            System.out.println(); // New line for better readability
        }

        System.out.printf("Total inventory size: %d\n", getNumberOfBooks(bookQuantities));
        System.out.printf("Total inventory value: %f\n", getTotalInventoryValue(bookQuantities, bookPrices));

    }
}

