package org.example;

public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public void soundWarning() {
        System.out.println("pling pling");
    }
}
