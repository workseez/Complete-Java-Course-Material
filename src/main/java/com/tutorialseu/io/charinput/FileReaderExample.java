package com.tutorialseu.io.charinput;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // The file we want to read is located in the src/main/resources directory
        String filePath = "src/main/resources/output.txt";

        // Create a FileReader object to read from the specified file
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;

            // Read characters one by one until the end of the file
            while ((character = fileReader.read()) != -1) {
                // Cast integer to char and print it
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
