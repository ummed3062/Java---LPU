package com.lpu.unit5.generics;

import java.security.PublicKey;

class NumericDemo<T extends Number> {  // Now T must be a Number (Integer, Double, Float, etc.)
    private T num;
    public NumericDemo(T num) {
        this.num = num;
    }
    public double square() {
        return num.doubleValue() * num.doubleValue();  // Safe operation
    }

    public static void main(String[] args) {

        NumericDemo<Float > obj = new NumericDemo<>(1.1f);
    }
}



