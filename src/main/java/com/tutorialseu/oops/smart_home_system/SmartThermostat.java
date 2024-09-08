package com.tutorialseu.oops.smart_home_system;

// Smart Thermostat class implementing the ControllableDevice interface
class SmartThermostat implements ControllableDevice {

    private boolean isOn = false; // Instance variable to track thermostat status
    private double temperature = 72.0; // Instance variable for temperature setting

    // Implementation of turnOn method
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Thermostat is turned ON.");
    }

    // Implementation of turnOff method
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Thermostat is turned OFF.");
    }

    // Override getStatus method to provide custom status
    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Smart Thermostat Status: " + status + ", Temperature: " + temperature + "°F");
    }

    // Method to set the temperature
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to: " + temperature + "°F");
    }
}
