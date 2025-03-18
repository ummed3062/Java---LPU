package com.lpu.unit4.exceptions;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

