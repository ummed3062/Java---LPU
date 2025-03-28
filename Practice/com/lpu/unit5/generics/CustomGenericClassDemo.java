package com.lpu.unit5.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Defining a generic class with type parameter T
class Box<T> {
    List<T> list = new ArrayList<>();
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
public class CustomGenericClassDemo {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>();
        // Creating an instance of Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        System.out.println("Integer Value: " + intBox.getValue());

//        Box type1 = new Box(); //raw type
//        type1.setValue("Ummed"); //valid
//        type1.setValue(24); //valid and autoboxing support

        // Using List with Diamond Operator
        List<String> names = new ArrayList<>();  // Compiler infers String type
        names.add("Ummed");
        names.add("Singh");
        System.out.println("Names: " + names);

//        Box<Integer> boxObj = new Box<Integer>();  // Explicit type declaration (before Java 7)

//        Box<Integer> boxObj = new Box<>();  // Compiler infers that it's Box<Integer>

        Box intBox1 = new Box();  // No type specified (RAW type)
        intBox1.setValue(10);
        intBox1.setValue("hello");

        int value = (Integer) intBox1.getValue();  // Needs explicit casting

//        Box<Integer> intBox = new Box<>();  // Compiler infers Integer type
//        intBox.setValue(10);
//        int value = intBox.getValue();  // No explicit casting needed!


//        List<Double> productPrices = new ArrayList<Double>();  // Old way
//
//        List<Double> productPrices = new ArrayList<>();  // Cleaner and safer

    }
}
