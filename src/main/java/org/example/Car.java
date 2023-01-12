package org.example;

public class Car extends Vehicle {

    private double price;
    private double discount = 0.9;

    private String salesPersonEmail;
    public Car(String name) {
        super(name);
        this.price = 10000;
    }

    public double getPrice() {
        return price*discount;
    }

    public String getSalesPersonEmail() {
        return salesPersonEmail;
    }

    public void setSalesPersonEmail(String salesPersonEmail) {
        if(salesPersonEmail.contains("g")) {
            //Validera email addressen och kasta error om den inte är valid
        }
        this.salesPersonEmail = salesPersonEmail;
    }
}
