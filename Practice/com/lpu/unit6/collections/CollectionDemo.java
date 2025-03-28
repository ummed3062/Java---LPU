package com.lpu.unit6.collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

//        1. Array
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);


//      2. ArrayList
        ArrayList<Integer> arrList = new ArrayList<>(1);
        arrList.add(20);
        arrList.add(30);
        System.out.println(arrList.get(0));


//        3. LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(10);
        System.out.println(list.get(0));






//
    }

    public void sort(int[] arr){


    }
}
