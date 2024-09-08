package com.tutorialseu.io.serialize;

import java.io.Serializable;

public class Manager extends Employee implements Serializable {
    private static final long serialVersionUID = 2L; // A unique identifier for this class

    private String department;

    public Manager(String name, int id, String department) {
        super(name, id); // Call the constructor of the Employee class
        this.department = department;
    }

    // Getter and toString method
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Manager{" + "name='" + getName() + "', id=" + getId() +
                ", department='" + department + '\'' + '}';
    }
}
