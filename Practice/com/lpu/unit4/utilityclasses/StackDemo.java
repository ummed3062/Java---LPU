package com.lpu.unit4.utilityclasses;

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
    }
}
