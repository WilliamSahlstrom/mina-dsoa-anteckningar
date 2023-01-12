package org.example;

public class Main {
    public static void main(String[] args) {

        // Vi instansirar två Car-objekt
        Car car = new Car("VW");
        Bike myBike = new Bike("Crecent");

        System.out.println(car.getName());
        System.out.println(myBike.getName());


    }
}