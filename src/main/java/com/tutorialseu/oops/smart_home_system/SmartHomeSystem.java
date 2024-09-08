package com.tutorialseu.oops.smart_home_system;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create instances of SmartLight and SmartThermostat
        ControllableDevice light = new SmartLight();
        SmartThermostat thermostat = new SmartThermostat();

        // Turn on the smart light and check its status
        light.turnOn();
        light.getStatus();

        // Turn on the smart thermostat, set the temperature, and check its status
        thermostat.turnOn();
        thermostat.setTemperature(75.0);
        thermostat.getStatus();

        // Turn off all devices
        light.turnOff();
        thermostat.turnOff();
    }
}
