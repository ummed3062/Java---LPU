package com.lpu.multithreading;

// Example using Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(8000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
public class ThreadExample{
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Thread is created but not started
        thread.start(); // Start the thread
        try {
            System.out.println(thread.isAlive());
            Thread.sleep(5000);
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
        System.out.println(thread.isAlive());
        System.out.println("Main method is running.");
    }
}

//        Thread.sleep(1000); // Thread is in the waiting state for 1 second

