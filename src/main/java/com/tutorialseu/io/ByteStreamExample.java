package com.tutorialseu.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        byte[] data = {72, 101, 108, 108, 111}; // "Hello" in ASCII

        ByteArrayInputStream inputStream = null;

        try {
            inputStream = new ByteArrayInputStream(data);
            int byteData;

            // Reading data byte by byte from the byte array
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData); // Print each byte as a character
            }

        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close(); // Close the stream to release resources
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
