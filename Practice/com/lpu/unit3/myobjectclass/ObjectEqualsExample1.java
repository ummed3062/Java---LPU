package com.lpu.unit3.myobjectclass;

class Bike {
    String model;
    Bike(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Bike bike = (Bike) obj;
        return model.equals(bike.model);
    }
}

public class ObjectEqualsExample1 {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Tesla");
        Bike bike2 = new Bike("Tesla");

        System.out.println(bike1.equals(bike2)); // true (based on model name)
    }
}

