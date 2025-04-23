package com.lpu.multithreading;

class InterThreadCommunication{
    synchronized void printMessage() {
        try {
            System.out.println("printMessage method executed");
            wait();
        } catch (InterruptedException e) {}
        System.out.println("Message Received");
    }
    synchronized void sendMessage() {
        System.out.println("Sending Message");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        notify();
    }
}
public class InterThreadMain {
    public static void main(String[] args) {
        InterThreadCommunication comm  = new InterThreadCommunication();

//        Thread thread1 = new Thread(comm);
        new Thread(() -> comm.printMessage()).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        new Thread(() -> comm.sendMessage()).start();
    }
}

