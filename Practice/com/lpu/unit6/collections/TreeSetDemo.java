package com.lpu.unit6.collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a set using the TreeSet class
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        System.out.println("Set using TreeSet: " + numbers);

        System.out.println("Headset: "+numbers.headSet(4, true));
        System.out.println("TailSet:  "+numbers.tailSet(4, false));

        System.out.println("Subset: " + numbers.subSet(2, false, 5, true));

//        boolean remove = numbers.removeAll(numbers);
//        Set<Integer> set = new HashSet<>();
//
//        System.out.println(numbers.ceiling(4));
////        [1, 2, 3, 4, 5] ->
//
////        numbers.addAll(set);
//

        System.out.println(numbers.first());
        System.out.println("Higher: " + numbers.higher(3));
        System.out.println("Lower: " + numbers.lower(3));
//
//        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }




//


    }
}
