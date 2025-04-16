package com.lpu.unit6.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(2);
        Deque<Integer> linkedListDeque = new LinkedList<>();

        deque.addFirst(10);

        deque.addFirst(20);
        deque.addFirst(30);
        deque.addFirst(40);

        deque.offerFirst(10);
        deque.offerFirst(20);
        deque.offerFirst(30);

//        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
}
