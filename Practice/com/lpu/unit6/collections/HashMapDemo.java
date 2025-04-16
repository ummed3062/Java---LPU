package com.lpu.unit6.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> languages = new HashMap<>();
        // add elements to hashmap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);


        for (Map.Entry<String, Integer> val: languages.entrySet()){

            System.out.println(val.getValue());
        }

        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        System.out.println(numbers);
    }



}

//_______________
//10
//20
//30
//__________________

