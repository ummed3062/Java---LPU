package com.lpu.multithreading;


class PriorityDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " +Thread.currentThread().getPriority());
    }
}
public class PriorityMain {
    public static void main(String[] args) {
        PriorityDemo t0 =  new PriorityDemo();
        t0.setPriority(Thread.MAX_PRIORITY);

        PriorityDemo t1 = new PriorityDemo();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
//        try {
//            Thread.sleep(5);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        t0.start();

    }
}


