package com.lpu.unit3.myobjectclass;

class Car7 implements Cloneable {
    String model;

    Car7(String model) {
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car7 car1 = new Car7("Tesla");
        Car7 car2 = (Car7) car1.clone();

        System.out.println(car1.model); // Tesla
        System.out.println(car2.model); // Tesla
    }
}

