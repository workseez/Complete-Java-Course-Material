package com.tutorialseu.io.passwordmanager;

import java.io.Serializable;

public class PasswordEntry implements Serializable {
    private String accountName;
    private String username;
    private String encryptedPassword;

    public PasswordEntry(String accountName, String username, String encryptedPassword) {
        this.accountName = accountName;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getUsername() {
        return username;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }
}
