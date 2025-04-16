package com.lpu.unit6.collections;


import java.util.*;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

//        1. Array
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);


//      2. ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(20);
        arrList.add(30);

        System.out.println(arrList.get(2));


//        3. LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(10);
//        System.out.println(list.get(0));

//        4. Set
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("Set: "+set);

//        5. Map

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(12345, "Ayush");
        System.out.println(studentMap);
        studentMap.put(12346, "Bhavya");
        System.out.println(studentMap);

//        Collection

//        List<Integer> list1 = new List<Integer>();


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        Integer val = list1.get(0);
        System.out.println(val);

        list1.addAll(list);

        System.out.println(list1.contains(10));


        




//
    }

    public void sort(int[] arr){


    }
}
