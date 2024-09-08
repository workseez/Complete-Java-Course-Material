package com.tutorialseu.io;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new InputStreamReader(System.in); // Reading from the console (System.in)
            bufferedReader = new BufferedReader(reader);

            System.out.print("Enter your name: ");
            String name = bufferedReader.readLine(); // Read a line of text from the console

            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close(); // Close the buffered reader to release resources
                }
                if (reader != null) {
                    reader.close(); // Close the reader to release resources
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
