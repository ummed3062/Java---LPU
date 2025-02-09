package com.lpu.unit2;

class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}
public class CalMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3); // Method call
        System.out.println("Sum: "+ result); // Output: Sum: 8
    }
}
