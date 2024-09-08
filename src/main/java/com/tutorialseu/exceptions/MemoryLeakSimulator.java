package com.tutorialseu.exceptions;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakSimulator {

    // Method to simulate memory leak and track memory usage
    public void simulateMemoryLeak() {
        List<int[]> memoryHog = new ArrayList<>(); // Collection to hold references
        Runtime runtime = Runtime.getRuntime(); // Get the runtime instance to monitor memory

        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                // Allocating memory for large arrays and adding to the list
                int[] largeArray = new int[100000];
                memoryHog.add(largeArray);

                // Measure memory usage every 1000th iteration
                if (i % 1000 == 0) {
                    long usedMemory = runtime.totalMemory() - runtime.freeMemory();
                    long maxMemory = runtime.maxMemory();
                    System.out.println("Created " + i + " arrays...");
                    System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
                    System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB\n");
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Memory limit reached! OutOfMemoryError caught.");
        } finally {
            // Resolve the memory leak by clearing the collection
            memoryHog.clear();
            System.out.println("Memory leak resolved. References cleared.");
        }
    }

    public static void main(String[] args) {
        MemoryLeakSimulator simulator = new MemoryLeakSimulator();
        simulator.simulateMemoryLeak();
    }
}
