package com.lpu.unit6.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> arr = new ArrayDeque<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> list = new PriorityQueue<>();

        arr.add(10);
        arr.add(20);
        arr.add(20);
        System.out.println(arr);

        System.out.println(arr.poll());

        System.out.println(arr);
        System.out.println(arr.peek());

        System.out.println(arr);
    }
}
