package com.lpu.revise.unit3;

class Car {								   //Ummed Singh
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car object is destroyed");
    }
}


public class ObjectFinalizeExample {
    public static void main(String[] args) {
        Car car = new Car();
        car = null;
        System.gc(); // Suggest garbage collection
    }
}
