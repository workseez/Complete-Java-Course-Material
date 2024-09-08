package com.tutorialseu.io.serialize;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // A unique identifier for this class

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and toString method
    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}