package com.lpu.unit3.myobjectclass;

class Car6 {
    String model;

    Car6(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car Model: " + model;
    }
}

public class ObjectToStringExample1 {
    public static void main(String[] args) {
        Car6 car = new Car6("Audi");
        System.out.println(car.toString()); // Output: Car Model: Audi
    }
}

