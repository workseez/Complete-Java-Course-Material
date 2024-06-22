package com.tutorialseu.oops.banking;


public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance >= amount) {
            System.out.println("Withdrawing: " + amount);
            deposit(-amount);  // Reusing deposit method to subtract amount
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


