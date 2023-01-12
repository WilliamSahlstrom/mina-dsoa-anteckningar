package org.example;

public class Shirt {

    private String brand;
    private double price;
    public Shirt(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Shirt(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
