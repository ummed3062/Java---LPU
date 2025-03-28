package com.lpu.unit5.generics;

public class NumericBox<T> {  // No restrictions!
    private T num;
    public NumericBox(T num) {
        this.num = num;
    }
    public double square() {
//        return num * num;  // ERROR: Cannot multiply an Object!
        return 1.1;
    }

    public static void main(String[] args) {

        NumericBox<String> str = new NumericBox<>("LPU");
    }

}
