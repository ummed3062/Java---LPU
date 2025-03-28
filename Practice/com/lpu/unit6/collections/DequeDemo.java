package com.lpu.unit6.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {


    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);

        deque.addFirst(20);
        deque.addLast(30);
        deque.offerFirst(50);

        System.out.println(deque.peekLast());

        System.out.println(deque);
    }
}
