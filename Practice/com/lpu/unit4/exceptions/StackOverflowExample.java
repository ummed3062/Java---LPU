package com.lpu.unit4.exceptions;

public class StackOverflowExample {
    static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }
    public static void main(String[] args) {
        recursiveMethod(); // Causes StackOverflowError
    }
}

