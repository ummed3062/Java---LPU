package com.lpu.unit3.myobjectclass;

class Car8 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car object is destroyed");
    }
}

public class ObjectFinalizeExample {
    public static void main(String[] args) {
        Car8 car = new Car8();
        car = null;
        System.gc(); // Suggest garbage collection
    }
}

