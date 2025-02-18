package com.lpu.unit3.myobjectclass;

class Car1 {
    String model;

    Car1(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Car1 car = (Car1) obj;
        return model.equals(car.model);
    }
}

public class ObjectEqualsExample1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Tesla");
        Car1 car2 = new Car1("Tesla");

        System.out.println(car1.equals(car2)); // true (based on model name)
    }
}

