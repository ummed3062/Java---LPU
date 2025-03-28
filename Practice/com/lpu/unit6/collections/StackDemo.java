package com.lpu.unit6.collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> arr = new Stack<>();

        int a = 1;
        int[] arr1 = {10, 20, 30};

        arr.add(10);
        arr.push(10);

        System.out.println(arr.peek());
    }
}
