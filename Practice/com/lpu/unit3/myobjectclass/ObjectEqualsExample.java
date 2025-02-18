package com.lpu.unit3.myobjectclass;

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

public class ObjectEqualsExample {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("Tesla");

        System.out.println(car1.equals(car2)); // false (different memory locations)
    }
}

