package com.tutorialseu.oops.banking;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance + overdraftLimit >= amount) {
            System.out.println("Withdrawing: " + amount);
            deposit(-amount);  // Reusing deposit method to subtract amount
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}


