package com.lpu.unit6.collections;

import java.util.Set;
import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20 ,30,40, 20));
        System.out.println(set);

        set.add(10);
        Set<Integer> set1 = new HashSet<>(Arrays.asList(100, 200 ,300,400, 200));

        set.addAll(set1);
        System.out.println(set);

        set.removeAll(set1);
        System.out.println(set);


//        Set<Integer> set1 = new TreeSet<>();

        System.out.println(set.hashCode());



    }
}
