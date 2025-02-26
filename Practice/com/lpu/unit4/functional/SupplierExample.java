package com.lpu.unit4.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to generate a random number
        Supplier<Double> randomValue = () ->  Math.random()*10;

        System.out.println(randomValue.get()); // Output: Random number


        List<Integer> nums = Arrays.asList(10, 15, 20, 25);

        nums.stream().filter(n ->n%2 == 0).forEach(System.out::println);

    }
}


