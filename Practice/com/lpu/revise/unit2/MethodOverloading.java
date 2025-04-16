package com.lpu.revise.unit2;

public class MethodOverloading {

//    Polymorphism
//    1. Method Overloading
//    2. Method Overriding

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
    }
}

class Calculator{
    int add(int a, int b){
        int res = a+b;
        return res;
    }

    double add(Double a, int b){
        double res = a+b;
        return res;
    }
}
