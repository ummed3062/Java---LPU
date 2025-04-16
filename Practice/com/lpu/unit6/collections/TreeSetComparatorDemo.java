package com.lpu.unit6.collections;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetComparatorDemo {
    public static void main(String[] args) {

        // Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(30, 20, 50, 40, 10));

        System.out.println("Nums Treeset: "+ nums);

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("cat");
        System.out.println("Animals TreeSet: " + animals);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

// animal1 > animal2 = positive
//            animal1 < animal2 => negative

//            "Dog".compareTo("cat");

//             elements are sorted in reverse order
//            if (value > 0) {
//                return -1;
//            }
//            else if (value < 0) {
//                return 1;
//            }
//            else {
//                return 0;
//            }

            return -value;
        }
    }
}
