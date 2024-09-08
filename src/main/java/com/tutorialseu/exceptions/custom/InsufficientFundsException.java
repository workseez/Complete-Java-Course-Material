package com.tutorialseu.exceptions.custom;

// Custom exception to handle insufficient funds scenario
public class InsufficientFundsException extends Exception {

    // Constructor that accepts a custom error message
    public InsufficientFundsException(String message) {
        super(message);
    }
}
