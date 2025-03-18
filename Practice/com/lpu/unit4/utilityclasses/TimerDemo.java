package com.lpu.unit4.utilityclasses;

import java.util.Timer;
import java.util.TimerTask;
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed!");
            }
        }, 2000); // Runs after 2 seconds
    }
}

