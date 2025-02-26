package com.lpu.unit3.abstraction;

abstract class Vehicle {


    Vehicle(){

    }

    int a = 10;
    abstract void start(); // Abstract method (no implementation)

    void stop() { // Concrete method (with implementation)
        System.out.println("Vehicle is stopping.");
    }
}



class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a self-start button.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {




        Vehicle myCar = new Car();
        myCar.start(); // Outputs: Car is starting with a key.
        myCar.stop();  // Outputs: Vehicle is stopping.

        Vehicle myBike = new Bike();
        myBike.start(); // Outputs: Bike is starting with a self-start button.
    }
}


