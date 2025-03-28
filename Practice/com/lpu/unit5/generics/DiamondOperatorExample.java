package com.lpu.unit5.generics;

import java.util.*;

//class Box<T> {  // Generic class
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}

public class DiamondOperatorExample {
    public static void main(String[] args) {
        // Using Diamond Operator
        Box<Double> doubleBox = new Box<>();  // Compiler infers Double type
        doubleBox.setValue(99.9);
        System.out.println("Double Value: " + doubleBox.getValue());

        // Using List with Diamond Operator
        List<String> names = new ArrayList<>();  // Compiler infers String type
        names.add("Ummed");
        names.add("Singh");
        System.out.println("Names: " + names);
    }
}

