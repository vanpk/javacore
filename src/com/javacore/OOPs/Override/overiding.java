package com.javacore.OOPs.Override;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class overiding extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        overiding obj = new overiding();
        obj.run();
    }
}
