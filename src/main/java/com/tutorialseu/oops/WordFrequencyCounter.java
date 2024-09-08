package com.tutorialseu.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Step 1: Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");
        String paragraph = scanner.nextLine();

        // Step 2: Normalize the text
        String normalizedText = normalizeText(paragraph);

        // Step 3: Split the text into words
        String[] words = normalizedText.split(" ");

        // Step 4: Count word frequencies
        HashMap<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {  // Ensure we don't count empty strings

                // The getOrDefault(key, defaultValue) method searches the map with
                // the key, if it is not present, puts the defaultValue for the key's
                // value
                wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
            }
        }

        // Step 5: Determine the most frequent word
        String mostFrequentWord = null;
        Iterator<Map.Entry<String, Integer>> iterator = wordFrequencies.entrySet().iterator();
        int maxFrequency = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Step 6: Output the result
        if (mostFrequentWord != null) {
            System.out.println("Most frequent word: \"" + mostFrequentWord + "\" with frequency: " + maxFrequency);
        } else {
            System.out.println("No valid words found in the input.");
        }

        scanner.close();
    }

    // Helper method to normalize the text
    private static String normalizeText(String text) {
        StringBuilder normalized = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Add only letters, digits, and spaces to the normalized text
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        return normalized.toString();
    }
}