package com.tutorialseu.oops.smart_home_system;

// Smart Light class implementing the ControllableDevice interface
class SmartLight implements ControllableDevice {

    private boolean isOn = false; // Instance variable to track light status

    // Implementation of turnOn method
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light is turned ON.");
    }

    // Implementation of turnOff method
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light is turned OFF.");
    }

    // Override getStatus method to provide custom status
    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Smart Light Status: " + status);
    }
}
