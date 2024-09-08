package com.tutorialseu.io.file;

import java.io.File;

public class DirectoryOperations {
    public static void main(String[] args) {
        // Directory path inside the resources folder
        String dirPath = "src/main/resources/com/tutorialseu/io/file/my_directory";
        String nestedDirPath = "src/main/resources/com/tutorialseu/io/file/my_directory/subdir1/subdir2";

        // Create a directory
        File dir = new File(dirPath);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }

        // Create nested directories
        File nestedDirs = new File(nestedDirPath);
        if (!nestedDirs.exists()) {
            if (nestedDirs.mkdirs()) {
                System.out.println("Nested directories created.");
            } else {
                System.out.println("Failed to create nested directories.");
            }
        }

        // List files in the directory
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            System.out.println("Files/Folders in " + dir.getName() + ":");
            for (File f : files) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("The directory is empty or does not exist.");
        }
    }
}