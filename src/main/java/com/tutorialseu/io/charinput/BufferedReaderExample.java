package com.tutorialseu.io.charinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // The file we want to read is located in the src/main/resources directory
        String filePath = "src/main/resources/output.txt";

        // Create a BufferedReader object to read from the specified file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read lines until the end of the file
            while ((line = bufferedReader.readLine()) != null) {
                // Print the line
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}