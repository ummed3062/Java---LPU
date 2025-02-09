package com.lpu.unit2;

class Car {
    String model;
    int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Model: "+ model + "Year: "+ year);
    }
}

class Garage {
    // Method that accepts a Car object as a parameter
    public void parkCar(Car car) {
        System.out.println("Parking car...");
        car.displayInfo();
    }
}

public class ObjAsParameters {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);

        Garage myGarage = new Garage();
// Passing an object as a parameter to the method
        myGarage.parkCar(myCar); // Output: Parking car... Model: Toyota, Year: 2022








//
    }
}



