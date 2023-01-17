package org.example;

public class Bike extends Vehicle implements ShopFeatures {

    public Bike(String name) {
        super(name);
    }

    @Override
    public void soundWarning() {
        System.out.println("pling pling");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
