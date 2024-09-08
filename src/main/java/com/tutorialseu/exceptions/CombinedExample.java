package com.tutorialseu.exceptions;

public class CombinedExample {

    public static void main(String[] args) {
        try {
            performTransaction();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void performTransaction() throws Exception {
        try {
            debitAccount();
        } catch (Exception e) {
            // Rethrowing the exception with additional context
            throw new Exception("Transaction failed during debit operation", e);
        }
    }

    public static void debitAccount() throws Exception {
        validateFunds();
    }

    public static void validateFunds() throws Exception {
        throw new Exception("Insufficient funds in the account");
    }
}


