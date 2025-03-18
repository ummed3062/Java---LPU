package com.lpu.revise;

public class ReturnDemo {

    public static void main(String[] args) {

        addNumbers(10, 30);

        System.out.println();
    }

    static void addNumbers(int a, int b){

        System.out.println(a + b);
        return;
    }
}
