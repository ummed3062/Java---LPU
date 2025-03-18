package com.lpu.unit4.utilityclasses;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClassDemo {


    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("task Executed");
            }
        }, 4000);
    }
}
