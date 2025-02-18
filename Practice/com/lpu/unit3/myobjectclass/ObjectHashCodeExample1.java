package com.lpu.unit3.myobjectclass;

class Car3 {
    String model;

    Car3(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}

public class ObjectHashCodeExample1 {
    public static void main(String[] args) {
        Car3 car1 = new Car3("BMW");
        Car3 car2 = new Car3("BMW");

        System.out.println(car1.hashCode()); // Same hash code
        System.out.println(car2.hashCode()); // Same hash code



    }
}

