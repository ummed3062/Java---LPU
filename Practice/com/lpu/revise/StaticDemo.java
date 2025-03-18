package com.lpu.revise;

public class StaticDemo {




    public static void main(String[] args) {


        CounterDemo.display();


        CounterDemo.display();
    }


}

class CounterDemo{

    static int count = 0;

    static void display(){

        count++;
        System.out.println(count);
    }
}
