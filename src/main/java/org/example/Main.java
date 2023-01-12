package org.example;

public class Main {
    public static void main(String[] args) {

        // Vi instansirar två Car-objekt
        Car car = new Car("VW");
        car.setSalesPersonEmail("Bossman@gmail.com");
        Bike myBike = new Bike("Crecent");

        System.out.println(car.getName());
        System.out.println(myBike.getName());


        System.out.printf("%s kostar %.2f, kontakta %s", car.getName(), car.getPrice(), car.getSalesPersonEmail());


    }
}