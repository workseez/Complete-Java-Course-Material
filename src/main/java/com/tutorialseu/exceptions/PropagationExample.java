package com.tutorialseu.exceptions;

public class PropagationExample {

    public static void main(String[] args) {
        try {
            processOrder();
        } catch (Exception e) {
            // Catching the propagated exception in the main method
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void processOrder() throws Exception {
        calculateTotalPrice(); // Calling calculateTotalPrice, which might throw an exception
    }

    public static void calculateTotalPrice() throws Exception {
        checkInventory(); // Calling checkInventory, which might throw an exception
    }

    public static void checkInventory() throws Exception {
        throw new Exception("Insufficient inventory for the order"); // Throwing an exception
    }
}
