package com.lpu.revise;

import java.util.ArrayList;

public class WrapperDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);

        String str = "123";

        int num = Integer.parseInt(str);
        System.out.println(num);


        String s = Integer.toString(num);



        int primitive = 10;

        Integer wrapper = primitive;

        System.out.println(wrapper);

        int priDemo = wrapper;


        Integer val = 10;

        System.out.println(System.identityHashCode(val));

        val = val +5;
        System.out.println(val);
        System.out.println(System.identityHashCode(val));


        Integer num1 = 100;
        Integer num2 = 100;

        Integer num3 = 200;
        Integer num4 = 200;


        System.out.println(num1 == num2);
        System.out.println(num3 == num4);


        String number = "123";

        int n = Integer.parseInt(number);


        char ch = '5';
        System.out.println(Character.isDigit(ch));
    }
}
