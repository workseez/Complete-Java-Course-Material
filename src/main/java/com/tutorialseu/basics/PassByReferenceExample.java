package com.tutorialseu.basics;

public class PassByReferenceExample {

    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling changeName method: " + person.name);

        // Calling method that changes the object state
        changeName(person);

        System.out.println("After calling changeName method: " + person.name);
    }

    public static void changeName(Person p) {
        p.name = "Bob"; // Changes the state of the object pointed to by 'p'
        System.out.println("Inside changeName method: " + p.name);
    }
}
