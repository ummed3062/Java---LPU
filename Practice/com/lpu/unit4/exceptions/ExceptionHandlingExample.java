package com.lpu.unit4.exceptions;

public class ExceptionHandlingExample {
    static void method1() {
        int result = 10 / 0; // ArithmeticException
    }
    static void method2() {
        method1();
    }
    public static void main(String[] args) {
        try {
            method2(); // Exception propagates, but is caught here
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}

