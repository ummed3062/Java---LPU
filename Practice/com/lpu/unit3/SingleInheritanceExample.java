package com.lpu.unit3;

class Vehicle {
    String brand = "Toyota";
    void honk() {
        System.out.println("Vehicle is honking...");
    }
}

// Child class (Sub class)
class Car extends Vehicle {
    int speed = 100;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
        myCar.honk();

        Vehicle myVehicle  = new Vehicle();
    }
}

