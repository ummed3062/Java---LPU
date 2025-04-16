package com.lpu.unit6.collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(20);
        arr.add(30);
//        Size + size/2 = 10 + 5 = 15;
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr.remove(0));
        System.out.println(arr.get(0));
        System.out.println(arr.size());


    }
}
