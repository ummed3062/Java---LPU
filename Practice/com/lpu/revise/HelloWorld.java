package com.lpu.revise;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Counter obj1 = new Counter();
//        obj1.countMethod();
//
//        Counter obj2 = new Counter();
//        obj2.countMethod();


        char c = 'a';

        System.out.println(c);

        int a = 120;							    //    ByteXL
        byte b = (byte) a;      // -128, -127.....0, 1,....127
        System.out.println(b); //  a - b => 129 - 127 = 2
//        OUTPUT => -127





    }
}


class Counter{

    int a;

     static int count = 0;

    void countMethod(){

        int var = 10;

        count++;
        System.out.println(count);
    }
}



