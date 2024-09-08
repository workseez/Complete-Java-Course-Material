package com.tutorialseu.basics;

public class SandwichExample {

    public static void getSlicesOfBread() {
        System.out.println("Got two slices of bread.");
    }

    public static void spreadPeanutButter() {
        System.out.println("Spread peanut butter on one slice.");
    }

    public static void spreadJelly() {
        System.out.println("Spread jelly on the other slice.");
    }

    public static void putSlicesTogether() {
        System.out.println("Put the slices together.");
    }

    public static void makeSandwich() {
        getSlicesOfBread();
        spreadPeanutButter();
        spreadJelly();
        putSlicesTogether();
        System.out.println("Sandwich is ready!");
    }

    public static void main(String[] args) {
        makeSandwich();
    }
}
