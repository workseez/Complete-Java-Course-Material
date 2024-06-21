package com.tutorialseu.oops;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use case 1: Logging
        singleton.log("Application started.");
        singleton.log("Performing some operations...");

        // Use case 2: Configuration Management
        singleton.setConfig("AppTheme", "Dark");
        singleton.setConfig("Language", "English");

        System.out.println("AppTheme: " + singleton.getConfig("AppTheme"));
        System.out.println("Language: " + singleton.getConfig("Language"));
    }
}
