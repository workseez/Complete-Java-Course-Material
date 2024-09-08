package com.tutorialseu.exceptions.resource;

public class TryWithResourcesCustomExample {
    public static void main(String[] args) {
        // Try-with-resources statement to automatically manage the Counter resource
        try (Counter counter = new Counter()) {
            // Use the counter
            counter.increment();
            counter.increment();
            System.out.println("Counter value inside try block: " + Counter.getCount());
        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.err.println("An error occurred: " + e.getMessage());
        }

        // Attempt to retrieve the counter value outside the try block
        System.out.println("Counter value outside try block: " + Counter.getCount());
    }
}
