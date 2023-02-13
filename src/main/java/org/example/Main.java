package org.example;

public class Main {
    public static void main(String[] args) {

        //Klassvariabler
        Car bil1 = new Car("Toyota");
        System.out.println(bil1.getCarsCreated());

        Car bil2 = new Car("VW");
        System.out.println(bil2.getCarsCreated());

        Car bil3 = new Car("Pagani");
        System.out.println(bil3.getCarsCreated());

        //Vi kan instansiera en klass med dess default konstruktor
        MinKlass minKlass = new MinKlass();
    }
}