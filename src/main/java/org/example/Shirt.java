package org.example;

public class Shirt extends Clothing implements ShopFeatures {

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

    @Override
    void mend() {
        super.condition = 100;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
