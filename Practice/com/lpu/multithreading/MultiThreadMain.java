package com.lpu.multithreading;

class MultiThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}
public class MultiThreadMain {
    public static void main(String[] args) {

        MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
        Thread t1 = new Thread(multiThreadDemo, "Thread 1");
        Thread t2 = new Thread(new MultiThreadDemo(), "Thread 2");

        System.out.println("Name of main thread: "+Thread.currentThread().getName());


        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
    }
}
