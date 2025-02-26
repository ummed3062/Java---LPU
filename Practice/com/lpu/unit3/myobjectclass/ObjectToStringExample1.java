package com.lpu.unit3.myobjectclass;

class Mahindra {
    String model;

    Mahindra(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car Model: " + model;
    }
}

public class ObjectToStringExample1 {
    public static void main(String[] args) {
        Mahindra mahindra = new Mahindra("Mahindra");
        System.out.println(mahindra.toString()); // Output: Car Model: Mahindra
    }
}

