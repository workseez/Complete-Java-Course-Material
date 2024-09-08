package com.tutorialseu.io.byteoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        String data = "Hello, this is a test using FileOutputStream.";
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/output.txt")) {
            // Convert the string into bytes
            byte[] bytesArray = data.getBytes();

            // Write bytes to the output file
            fos.write(bytesArray);

            // Flush the stream
            fos.flush();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
