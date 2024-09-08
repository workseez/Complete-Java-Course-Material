package com.tutorialseu.exceptions;

public class RethrowingExample {

    public static void main(String[] args) {
        try {
            handleUserRegistration("JohnDoe", "password123");
            handleUserRegistration("JaneDoe", ""); // This will cause an exception
        } catch (Exception e) {
            // Handling the rethrown exception in the main method
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void handleUserRegistration(String username, String password) throws Exception {
        try {
            validatePassword(password);
            System.out.println("User " + username + " registered successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error in handleUserRegistration: " + e.getMessage());
            // Adding context before rethrowing
            throw new Exception("Registration failed for user: " + username, e);
        }
    }

    public static void validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
    }
}
