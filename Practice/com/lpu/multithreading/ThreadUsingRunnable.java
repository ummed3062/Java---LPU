package com.lpu.multithreading;

class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Thread via Runnable interface");
    }
}
public class ThreadUsingRunnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
