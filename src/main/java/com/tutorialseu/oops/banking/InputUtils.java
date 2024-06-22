package com.tutorialseu.oops.banking;
import java.util.Scanner;

public class InputUtils {
    private Scanner scanner;

    public InputUtils() {
        this.scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        return value;
    }

    public double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        return value;
    }
}


