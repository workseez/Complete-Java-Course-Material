package com.tutorialseu.exceptions.resource;

class Counter implements AutoCloseable {
    private static int count = 0;

    public Counter() {
        System.out.println("Counter initialized.");
    }

    public void increment() {
        count++;
        System.out.println("Counter: " + count);
    }

    @Override
    public void close() {
        // Reset the counter when the resource is closed
        count = 0;
        System.out.println("Counter reset.");
    }

    // Method to retrieve the current count
    public static int getCount() {
        return count;
    }
}
