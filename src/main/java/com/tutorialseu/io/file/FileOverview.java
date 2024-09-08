package com.tutorialseu.io.file;

import java.io.File;
import java.io.IOException;

public class FileOverview {
    public static void main(String[] args) {
        // Specify the path in the resources folder
        String filePath = "src/main/resources/com/tutorialseu/io/file/output.txt";

        // Create a File object representing the file path
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist. Creating the file...");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }

        // Get file name
        System.out.println("File name: " + file.getName());

        // Get file path
        System.out.println("File path: " + file.getAbsolutePath());
    }
}