package com.tutorialseu.basics;

public class PassByValueExample {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling changeValue method: x = " + x);

        // Calling method that changes the value of x
        changeValue(x);

        System.out.println("After calling changeValue method: x = " + x);
    }

    public static void changeValue(int num) {
        num = 20; // Changes only the value of num, not the original x
        System.out.println("Inside changeValue method: num = " + num);
    }
}
