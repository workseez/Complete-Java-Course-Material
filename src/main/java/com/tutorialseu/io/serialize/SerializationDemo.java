// File: com/tutorialseu/io/serialize/SerializationDemo.java
package com.tutorialseu.io.serialize;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class SerializationDemo {

    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("Tutorials Eu", 101, 20);

        // Serialize the student object
        try (FileOutputStream fileOut = new FileOutputStream("src/student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(student);
            System.out.println("Student object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object
        try (FileInputStream fileIn = new FileInputStream("src/student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Student object deserialized successfully.");
            deserializedStudent.displayStudentDetails();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}