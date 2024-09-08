package com.tutorialseu.io.file;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String filePath = "src/main/resources/com/tutorialseu/io/file/example.txt";
        String renamedFilePath = "src/main/resources/com/tutorialseu/io/file/renamed_example.txt";

        File file = new File(filePath);

        try {
            // Create a new file if it doesn't exist
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            }

            // Rename the file
            File renamedFile = new File(renamedFilePath);
            if (file.renameTo(renamedFile)) {
                System.out.println("File renamed to: " + renamedFile.getName());
            } else {
                System.out.println("Failed to rename the file.");
            }

            // Delete the file
            if (renamedFile.delete()) {
                System.out.println("File deleted: " + renamedFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}