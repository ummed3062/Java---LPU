package com.lpu.revise.unit2;

public class StringPerformanceCheck {
    public static void main(String[] args) {
//        String - Immutable
        long startTime;
        long endTime;
        String str = new String("");
        startTime = System.currentTimeMillis();
        for (int i = 0;i<100000; i++){
            str = str.concat(i+""); // str = 0 -> 01 -> 012 -> 0123
        }
        endTime = System.currentTimeMillis();
        System.out.println("String total time: " + (endTime - startTime) + "ms");
// 		StringBuilder - mutable, not thread safe


        StringBuilder strBul = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0;i<100000; i++){
            strBul.append(i); // strBul = 0 -> 01 -> 012 -> 0123
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder total time: " + (endTime - startTime) + "ms");


//		StringBuffer - mutable, thread safe
        StringBuffer strBuf = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0;i<100000; i++){
            strBuf.append(i); // strBul = 0 -> 01 -> 012 -> 0123
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer total time: " + (endTime - startTime) + "ms");




    }
}

