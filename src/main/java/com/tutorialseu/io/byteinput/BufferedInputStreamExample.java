package com.tutorialseu.io.byteinput;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        // Load the file using the class loader to ensure it is found in the classpath
        InputStream fileStream = BufferedInputStreamExample.class.getClassLoader().getResourceAsStream("buffered_example.txt");

        if (fileStream == null) {
            System.out.println("File not found in the classpath");
            return;
        }

        try (BufferedInputStream bis = new BufferedInputStream(fileStream)) {
            int data;

            // Read and print each byte using a buffered input stream
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


