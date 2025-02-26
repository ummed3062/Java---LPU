package com.lpu.unit4.functional;

import java.util.function.Function;
public class FunctionExample {
    public static void main(String[] args) {
        // Function to calculate the square of a number
        Function<Integer, Integer> square = num -> num * num;

        System.out.println(square.apply(5)); // Output: 25
        System.out.println(square.apply(7)); // Output: 49
    }
}

