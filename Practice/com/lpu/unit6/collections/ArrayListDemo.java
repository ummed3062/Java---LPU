package com.lpu.unit6.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(20);
        arr.add(30);



        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr.remove(0));
        System.out.println(arr.get(0));
        System.out.println(arr.size());
    }
}
