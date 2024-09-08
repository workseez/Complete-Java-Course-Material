package com.tutorialseu;

public class ArrayGenerator {

    // This method returns an array containing the first n natural numbers.
    public static int[] generateNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = generateNumbers(5); // numbers will be [1, 2, 3, 4, 5]

        for (int number : numbers) {
            System.out.print(number + " "); // Output: 1 2 3 4 5
        }
    }
}