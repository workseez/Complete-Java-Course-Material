package com.tutorialseu.io.charoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "src/main/resources/output.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            // Writing multiple lines to the file
            bufferedWriter.write("Buffered Writer Example:\n");
            bufferedWriter.write("This is the first line.\n");
            bufferedWriter.write("This is the second line.\n");

            // Adding more content
            bufferedWriter.write("Adding more content to the file using BufferedWriter.\n");

            // Flush the buffer to ensure all data is written out
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

