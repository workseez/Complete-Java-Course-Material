package com.tutorialseu.basics;

public class BasicOperations {
    public static void main(String[] args) {
        // Hard-coded values
        int num1 = 10;
        int num2 = 5;

        // Step 1: Display the hard-coded integers
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);

        // Step 2: Convert integers to strings and concatenate them
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        String concatenatedResult = strNum1 + strNum2;
        System.out.println("Concatenated result: " + concatenatedResult);

        // Step 3: Calculate sum, difference, product, and quotient
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;  // Type conversion for precise division

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Step 4: Use a ternary operator to compare the two numbers
        String comparisonResult = (num1 > num2) ? "First number is greater" : "Second number is greater or equal";
        System.out.println(comparisonResult);

        // Step 5: Demonstrate operator precedence with a complex expression
        int complexExpressionResult = (num1 + num2) * num1 / num2 - num1;
        System.out.println("Result of complex expression ((num1 + num2) * num1 / num2 - num1): " + complexExpressionResult);
    }
}
