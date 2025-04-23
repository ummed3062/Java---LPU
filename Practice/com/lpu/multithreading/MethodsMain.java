package com.lpu.multithreading;


class StopDemo extends Thread {
    private volatile boolean running = true;
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
    public void stopThread() {
        running = false;
    }
}
public class MethodsMain {
    public static void main(String[] args) throws InterruptedException {
        StopDemo t = new StopDemo();
        t.start();
        Thread.sleep(4000); // Let it run for a while
        t.stopThread(); // Stop the thread
        System.out.println("Thread has been stopped.");
    }
}
