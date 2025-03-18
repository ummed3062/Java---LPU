package com.lpu.unit4.exceptions;

public class UserInputExample {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        assert age >= 0 : "Age cannot be negative"; // ❌ Wrong! Use exception handling instead.
        System.out.println("User's age: " + age);

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

    }
}

