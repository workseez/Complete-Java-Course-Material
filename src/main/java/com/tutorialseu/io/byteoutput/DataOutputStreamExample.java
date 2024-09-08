package com.tutorialseu.io.byteoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/data_output.bin");
             DataOutputStream dos = new DataOutputStream(fos)) {

            // Write some primitive data types
            dos.writeInt(25);
            dos.writeFloat(5.75f);
            dos.writeBoolean(true);
            dos.writeUTF("This is a string");

            // Flush the stream
            dos.flush();

            System.out.println("Primitive data written to file successfully using DataOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

