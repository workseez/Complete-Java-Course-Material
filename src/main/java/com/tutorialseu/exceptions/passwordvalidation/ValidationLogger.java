package com.tutorialseu.exceptions.passwordvalidation;

public class ValidationLogger implements AutoCloseable {

    private static boolean hasLoggedCompletion = false;

    public void log(String status, String message) {
        System.out.printf("Status: %s | Message: %s%n", status, message);
    }

    public void logSuccess() {
        log("SUCCESS", "The password meets all security criteria.");
    }

    public void logFailure(String reason) {
        log("FAILURE", reason);
    }

    @Override
    public void close() {
        if (!hasLoggedCompletion) {
            log("INFO", "Password validation process completed.");
            hasLoggedCompletion = true;
        }
    }
}



