package com.tutorialseu.basics;

public class ConsoleOutputExample {
    public static void main(String[] args) {
        // Using print and println
        System.out.print("This is a ");
        System.out.println("single line of text.");//This will return the cursor to the next line

        // Using printf for formatted output
        int age = 25;
        double height = 1.75;
        System.out.printf("Age: %d years, Height: %.2f meters%n", age, height);
    }
}
