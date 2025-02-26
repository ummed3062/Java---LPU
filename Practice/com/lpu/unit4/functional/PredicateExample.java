package com.lpu.unit4.functional;

import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(10)); // Output: true
        System.out.println(isEven.test(15)); // Output: false
    }
}


