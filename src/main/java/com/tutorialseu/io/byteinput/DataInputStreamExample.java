package com.tutorialseu.io.byteinput;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamExample {
    public static void main(String[] args) {
        // Load the binary file using the class loader
        InputStream fileStream = DataInputStreamExample.class.getClassLoader().getResourceAsStream("data_output.bin");

        if (fileStream == null) {
            System.out.println("File not found in the classpath");
            return;
        }

        try (DataInputStream dis = new DataInputStream(fileStream)) {
            // Reading primitive data types from the binary file
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            boolean booleanValue = dis.readBoolean();
            String stringValue = dis.readUTF();

            // Displaying the values
            System.out.println("Integer: " + intValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.println("String: " + stringValue);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
