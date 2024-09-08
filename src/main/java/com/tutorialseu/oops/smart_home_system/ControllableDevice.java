package com.tutorialseu.oops.smart_home_system;

// Interface definition for controllable devices
interface ControllableDevice {
    // Abstract method to turn on the device
    void turnOn();

    // Abstract method to turn off the device
    void turnOff();

    // Default method to get device status
    default void getStatus() {
        System.out.println("Status: Unknown");
    }
}
