package com.tutorialseu.io.charoutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "src/main/resources/output.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Writing a string to the file
            writer.write("Hello, World!\n");
            writer.write("Welcome to the Java Character Output Streams chapter.\n");

            // Writing a character array to the file
            char[] chars = {'J', 'a', 'v', 'a'};
            writer.write(chars);

            // Flush the writer to ensure all data is written out
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
