package com.lpu.multithreading;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Main thread: "+ thread);
    }
}
