package com.tutorialseu.io.byteoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        String data = "Hello, this is a test using BufferedOutputStream.";
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/buffered_output.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // Convert the string into bytes
            byte[] bytesArray = data.getBytes();

            // Write bytes to the buffered stream
            bos.write(bytesArray);

            // Flush the stream
            bos.flush();

            System.out.println("Data written to file successfully using BufferedOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}