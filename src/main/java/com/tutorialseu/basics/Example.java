package com.tutorialseu.basics;

public class Example {

    // A void method with no parameters
    public static void sayHello() {
        System.out.println("Hello, world!"); // This line prints "Hello, world!" to the console
    }

    // A void method with parameters
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!"); // This line prints "Hello, [name]!" to the console
    }

    public static void main(String[] args) {
        sayHello(); // Calling the sayHello method
        greetPerson("Alice"); // Calling the greetPerson method with the argument "Alice"
    }
}
