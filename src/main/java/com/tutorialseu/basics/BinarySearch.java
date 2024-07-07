package com.tutorialseu.basics;

public class BinarySearch {

    public static int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Find the middle index

            if (sortedArray[mid] == target) {  // Target found
                return mid;
            }
            if (sortedArray[mid] < target) {  // Search in the right half
                low = mid + 1;
            } else {  // Search in the left half
                high = mid - 1;
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
