package com.lpu.unit2;

class Calculator {
    // Method to add two numbers
     public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, int b) {
        return a + b;
    }
    public double add( int b, double a) {
        return a + b;
    }

    int mulOfNumber(int num1, int num2){

        return num1*num2;
    }

    void addString(String str1, String str2){

        return;
    }
}
public class CalMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double result = calc.add(5.6, 3); // Method call

        calc.add(10, 5, 6);
        System.out.println("Sum: "+ result); // Output: Sum: 8
    }
}
