package com.tutorialseu.io.passwordmanager;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.*;

public class PasswordManager {
    private static final String FILE_NAME = "passwords.dat";
    private static final String KEY_FILE_NAME = "aeskey.dat";
    private static final String INIT_MESSAGE = "No master password found. Setting up a new master password.";
    private static SecretKey secretKey;
    private String encryptedMasterPassword;
    private List<PasswordEntry> entries = new ArrayList<>();

    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();

        // Load the AES key from file or generate a new one
        loadOrGenerateKey();

        if (manager.initialize()) {
            manager.run();
            manager.saveEntries();
        }
    }

    private static void loadOrGenerateKey() {
        File keyFile = new File(KEY_FILE_NAME);
        if (keyFile.exists()) {
            try (FileInputStream fis = new FileInputStream(keyFile)) {
                byte[] keyBytes = fis.readAllBytes();
                secretKey = new SecretKeySpec(keyBytes, "AES");
            } catch (IOException e) {
                throw new RuntimeException("Error loading encryption key", e);
            }
        } else {
            try {
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(128); // AES key size is 128 bits
                secretKey = keyGen.generateKey();

                // Save the key to a file for future use
                try (FileOutputStream fos = new FileOutputStream(KEY_FILE_NAME)) {
                    fos.write(secretKey.getEncoded());
                }
            } catch (Exception e) {
                throw new RuntimeException("Error generating encryption key", e);
            }
        }
    }

    private boolean initialize() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println(INIT_MESSAGE);
            setMasterPassword();
        } else {
            this.loadEntries();
            if (!authenticate()) {
                return false;
            }
        }
        return true;
    }

    private void setMasterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set your Master Password: ");
        String masterPassword = scanner.nextLine();
        this.encryptedMasterPassword = encrypt(masterPassword);
        saveEntries();
    }

    private boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Master Password: ");
        String enteredPassword = scanner.nextLine();
        String encryptedEnteredPassword = encrypt(enteredPassword);

        if (!encryptedMasterPassword.equals(encryptedEnteredPassword)) {
            System.out.println("Incorrect Password. Access Denied.");
            return false;
        }

        System.out.println("Access Granted.");
        return true;
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPassword Manager");
            System.out.println("1. Add Password");
            System.out.println("2. View Passwords");
            System.out.println("3. Remove Password");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPassword(scanner);
                    break;
                case 2:
                    viewPasswords();
                    break;
                case 3:
                    removePassword(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addPassword(Scanner scanner) {
        System.out.print("Enter Account Name: ");
        String accountName = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        String encryptedPassword = encrypt(password);
        PasswordEntry entry = new PasswordEntry(accountName, username, encryptedPassword);
        entries.add(entry);

        System.out.println("Password added successfully.");
    }

    private void viewPasswords() {
        for (PasswordEntry entry : entries) {
            String decryptedPassword = decrypt(entry.getEncryptedPassword());
            System.out.println("Account: " + entry.getAccountName());
            System.out.println("Username: " + entry.getUsername());
            System.out.println("Password: " + decryptedPassword);
            System.out.println();
        }
    }

    private void removePassword(Scanner scanner) {
        System.out.print("Enter Account Name to remove: ");
        String accountName = scanner.nextLine();

        entries.removeIf(entry -> entry.getAccountName().equalsIgnoreCase(accountName));
        System.out.println("Password removed successfully.");
    }

    private String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error encrypting data", e);
        }
    }

    private String decrypt(String encryptedData) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error decrypting data", e);
        }
    }

    private void loadEntries() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            this.encryptedMasterPassword = (String) ois.readObject();
            entries = (List<PasswordEntry>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No saved passwords found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading passwords: " + e.getMessage());
        }
    }

    private void saveEntries() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(encryptedMasterPassword);
            oos.writeObject(entries);
        } catch (IOException e) {
            System.out.println("Error saving passwords: " + e.getMessage());
        }
    }
}