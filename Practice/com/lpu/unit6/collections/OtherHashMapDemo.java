package com.lpu.unit6.collections;

import java.util.HashMap;
import java.util.TreeMap;
public class OtherHashMapDemo {
    public static void main(String[] args) {

        // create a treemap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        // create hashmap from the treemap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);
    }
}

