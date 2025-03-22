package com.lpu.revise;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionPropagation {

    static void method3() throws FileNotFoundException {
        System.out.println("method 3");

        throw new IllegalArgumentException("Exception generated with help of throw");

    }
    static void method2() throws FileNotFoundException{
        System.out.println("method 2");

        method3();
        System.out.println("Method2  executed after the method3");
    }
    static void method1() throws FileNotFoundException{
        System.out.println("Method1");
        method2();
        System.out.println("Method1  executed after the method2");
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Main Method");
        try {
            method1();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main method executed after the method1");
    }
}
