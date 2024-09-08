package com.tutorialseu.io.file;

import java.io.File;

public class FilePermissions {
    public static void main(String[] args) {
        String filePath = "src/main/resources/com/tutorialseu/io/file/output.txt";
        File file = new File(filePath);

        // Check if the file is readable, writable, and executable
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Can execute: " + file.canExecute());

        // Set file to be read-only
        if (file.setWritable(false)) {
            System.out.println("File set to read-only.");
        } else {
            System.out.println("Failed to set file to read-only.");
        }

        // Set file to be writable again
        if (file.setWritable(true)) {
            System.out.println("File set to writable.");
        } else {
            System.out.println("Failed to set file to writable.");
        }
    }
}