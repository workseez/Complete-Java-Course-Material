package com.tutorialseu.oops;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    // Volatile variable to ensure visibility of changes to instances across threads
    private static volatile Singleton instance = null;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Double-checked locking to ensure thread safety
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method for logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    // Example method for managing configuration settings
    private final Map<String, String> config = new HashMap<>();

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public String getConfig(String key) {
        return config.get(key);
    }
}
