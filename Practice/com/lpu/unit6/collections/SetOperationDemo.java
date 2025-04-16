package com.lpu.unit6.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationDemo {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(10, 40, 20, 60, 30));

        System.out.println("Hashset: "+ hashSet);

        TreeSet<Integer> evenNumber = new TreeSet<>();
        evenNumber.add(2);
        evenNumber.add(8);
        System.out.println("Even number: " + evenNumber);
        // Creating a set using the TreeSet class
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        System.out.println("Set using TreeSet: " + numbers);

        numbers.addAll(evenNumber);
        System.out.println("Union: "+ numbers);

        numbers.retainAll(evenNumber);
        System.out.println("Intersection: "+ numbers);

        numbers.removeAll(evenNumber);
        System.out.println(numbers);

        System.out.println(numbers.contains(6));
    }
}
