package com.lpu.unit3.myobjectclass;

class Car2 {
    String model;

    Car2(String model) {
        this.model = model;
    }
}

public class ObjectHashCodeExample {
    public static void main(String[] args) {
        Car2 car1 = new Car2("BMW");
        Car2 car2 = new Car2("BMW");

        System.out.println(car1.hashCode()); // Different hash codes
        System.out.println(car2.hashCode()); // Different hash codes
    }
}

