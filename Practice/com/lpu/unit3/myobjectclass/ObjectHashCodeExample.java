package com.lpu.unit3.myobjectclass;

class BMW {
    String model;
    BMW(String model) {
        this.model = model;
    }
}

public class ObjectHashCodeExample {
    public static void main(String[] args) {
        BMW bmw1 = new BMW("BMW");
        BMW bmw2 = new BMW("BMW");

        System.out.println(bmw1.hashCode()); // Different hash codes
        System.out.println(bmw2.hashCode()); // Different hash codes
    }
}

