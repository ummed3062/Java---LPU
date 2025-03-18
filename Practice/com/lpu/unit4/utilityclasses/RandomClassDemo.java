package com.lpu.unit4.utilityclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class RandomClassDemo {


    public static void main(String[] args) {

        Random obj = new Random();

        int num = obj.nextInt(100);
        System.out.println(num);

        ArrayList<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);

        System.out.println(set);


        list.add(10);
        list.add(10);

        System.out.println(list.get(1));

        int[] arr = {10, 20, 30};
        System.out.println(arr[5]);




    }
}
