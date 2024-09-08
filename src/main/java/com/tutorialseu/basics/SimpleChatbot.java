package com.tutorialseu.basics;

import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their input
        System.out.println("You: ");
        String userInput = scanner.nextLine(); // Read the user's input and store it in the variable userInput

        // Check if the user's input is a greeting (e.g., "hello" or "hi")
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            System.out.println("Chatbot: Hello! How can I help you today?");
        }

        // Check if the user's input is an inquiry about well-being (e.g., "how are you" or "how's it going")
        if (userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how's it going")) {
            System.out.println("Chatbot: I'm just a bot, but I'm here to help you!");
        }

        // Check if the user's input is about the weather (e.g., "what's the weather like" or "weather")
        if (userInput.equalsIgnoreCase("what's the weather like") || userInput.equalsIgnoreCase("weather")) {
            System.out.println("Chatbot: I don't have real-time weather data, but it's always sunny in the digital world!");
        }

        // Check if the user's input is a farewell (e.g., "bye" or "goodbye")
        if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Goodbye! Have a great day!");
        }

        // If the user's input doesn't match any of the predefined options, respond with a default message
        if (!userInput.equalsIgnoreCase("hello") && !userInput.equalsIgnoreCase("hi") &&
                !userInput.equalsIgnoreCase("how are you") && !userInput.equalsIgnoreCase("how's it going") &&
                !userInput.equalsIgnoreCase("what's the weather like") && !userInput.equalsIgnoreCase("weather") &&
                !userInput.equalsIgnoreCase("bye") && !userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: I'm sorry, I don't understand that.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
