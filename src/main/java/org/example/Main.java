package org.example;

public class Main {
    String test;
    public static void main(String[] args) {


        //Overload
        Shirt myShirt = new Shirt("H&M");
        myShirt.setPrice(25);
        //Överlaggring, samma metod med olika antal parametrar
        Shirt anotherShirt = new Shirt("Golf Wang", 15);

        // Vi instansirar två Car-objekt
        Car car = new Car("VW");
        car.setSalesPersonEmail("Bossman@gmail.com");
        Bike myBike = new Bike("Crecent");

        //Abstrakta klass kan inte instanstieras men nog fungera som typ
        Clothing shirt = new Shirt("Balenciaga");
        System.out.printf("This shirt is %s\n", anotherShirt.getCondition());

        //Upcasting
        Vehicle myRide = new Car("Bugatti");
        System.out.printf("Idag åker jag med min %s\n", myRide.getName());
        myRide.soundWarning();
        myRide = new Bike("TeslaBike");
        System.out.printf("Imorgon vill jag åka med %s\n", myRide.getName());

        System.out.println(car.getName());
        System.out.println(myBike.getName());


        myRide.soundWarning();

        System.out.printf("%s kostar %.2f, kontakta %s", car.getName(), car.getPrice(), car.getSalesPersonEmail());


    }
}