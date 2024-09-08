package com.tutorialseu.io.serialize;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class SerializationInheritanceDemo {

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, "HR");

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("src/main/resources/serialized_objects/manager.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(manager); // Serialize the manager object
            System.out.println("Manager object serialized: " + manager);

        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Manager deserializedManager = null;
        try (FileInputStream fileIn = new FileInputStream("src/main/resources/serialized_objects/manager.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            deserializedManager = (Manager) in.readObject(); // Deserialize the manager object
            System.out.println("Manager object deserialized: " + deserializedManager);

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
