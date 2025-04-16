package com.lpu.revise.unit2;

public class StringDemo {

    public static void main(String[] args) {

        String str = "LPU";
        System.out.println(System.identityHashCode(str));
//        System.out.println(str.hashCode());

        str = str + " Punjab";
        System.out.println(System.identityHashCode(str));

    }
}
