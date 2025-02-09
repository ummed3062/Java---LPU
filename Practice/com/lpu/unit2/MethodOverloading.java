package com.lpu.unit2;

class Calculator1 {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers (Overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two doubles (Overloaded method)
    public double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        System.out.println("Sum (2 ints): "+ calc.add(5, 3)); // Output: 8
        System.out.println("Sum (3 ints): " + calc.add(5, 3, 2)); // Output: 10
        System.out.println("Sum (2 doubles): "+ calc.add(2.5, 3.7)); // Output: 6.2
    }
}
