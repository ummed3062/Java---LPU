package com.lpu.multithreading;


class JoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo thread = new JoinDemo();
        thread.start();
        thread.join(); // Main thread waits for thread to finish
        System.out.println("Main thread finished after thread.");
    }
}
