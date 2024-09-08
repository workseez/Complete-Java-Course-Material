package com.tutorialseu.oops.math_quiz;

import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;

    // Constructor to generate random operands and a random operator
    public Question() {
        Random rand = new Random();
        this.operand1 = rand.nextInt(100) + 1; // Random number between 1 and 100
        this.operand2 = rand.nextInt(100) + 1; // Random number between 1 and 100
        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(4)];
        calculateAnswer();
    }

    // Method to calculate the correct answer based on the operator
    private void calculateAnswer() {
        switch (operator) {
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
        }
    }

    // Method to print the generated question
    public void generateQuestion() {
        System.out.println("What is " + operand1 + " " + operator + " " + operand2 + "?");
    }

    // Method to check if the user's answer is correct
    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001; // Allowing a small tolerance for floating-point answers
    }
}
