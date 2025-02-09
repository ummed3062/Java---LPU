package com.lpu.unit2;

public class ConstructorDemo {

    ConstructorDemo(){
        System.out.println("Constructor executed");
    }
//
    ConstructorDemo(int num1){
        System.out.println("Constructor with 1 par executed");
    }
    ConstructorDemo(int num1, int num2){
        System.out.println("Constructor with 2 par executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        ConstructorDemo cD = new ConstructorDemo(2,3);
    }
}
