package com.tutorialseu.oops.banking;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private List<BankAccount> accounts;
    private InputUtils inputUtils;

    public BankService() {
        this.accounts = new ArrayList<>();
        this.inputUtils = new InputUtils();
    }

    public void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = inputUtils.readString();
        System.out.print("Enter initial balance: ");
        double balance = inputUtils.readDouble();

        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int accountType = inputUtils.readInt();

        switch (accountType) {
            case 1:
                accounts.add(new SavingsAccount(accountNumber, balance));
                break;
            case 2:
                System.out.print("Enter overdraft limit: ");
                double overdraftLimit = inputUtils.readDouble();
                accounts.add(new CurrentAccount(accountNumber, balance, overdraftLimit));
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }

        System.out.println("Account created successfully.");
    }

    public void depositMoney() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = inputUtils.readDouble();
            account.deposit(amount);
        }
    }

    public void withdrawMoney() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = inputUtils.readDouble();
            account.withdraw(amount);
        }
    }

    public void checkBalance() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        }
    }

    private BankAccount findAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = inputUtils.readString();
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}


