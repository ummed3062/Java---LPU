package com.singh;

public class Counter {   // cntNmb

    static int cntNmb = 0;

    int instanceVar = 20;
    public void countNumber(){
        cntNmb++; // 1
        int localVar = 10;
        System.out.println(cntNmb);
    }
}
