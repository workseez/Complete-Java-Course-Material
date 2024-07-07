package com.tutorialseu.basics;

import java.util.Arrays;

public class RemoveDuplicates {
    // Function to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        // Check if the array is empty or has one element
        if (array == null || array.length <= 1) {
            return array;
        }

        // Sort the array
        Arrays.sort(array);

        // Create a temporary array to store unique elements
        int[] temp = new int[array.length];
        int j = 0; // Index for the temporary array

        // Iterate over the array and copy unique elements to the temporary array
        for (int i = 0; i < array.length - 1; i++) {
            // Check if the current element is different from the next element
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        // Copy the last element as it was not checked in the loop
        temp[j++] = array[array.length - 1];

        // Create a result array with the size of unique elements
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {4, 5, 9, 4, 2, 2, 8, 9, 1, 3, 6, 1, 9, 9};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the result
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}

