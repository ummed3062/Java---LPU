package com.lpu.unit4.utilityclasses;

import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(100)); // Random number between 0 and 99
    }
}

