package com.tutorialseu.exceptions.custom;

public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Throwing custom exception with a meaningful message
            throw new InsufficientFundsException("Insufficient funds. Your balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
