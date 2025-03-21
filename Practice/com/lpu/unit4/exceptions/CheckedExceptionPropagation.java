package com.lpu.unit4.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class CheckedExceptionPropagation {
    static void method3() throws FileNotFoundException{
        System.out.println("Method 3");
        FileReader file = new FileReader("demo.txt");
        System.out.println("method 3 executed after exception");
    }
    static void method2() throws FileNotFoundException{
        System.out.println("method 2");
        method3();
        System.out.println("Method 2 executed after call to method 3");
    }
    static void method1(){
        System.out.println("Method 1");
        try {
            method2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Method 1 executed after call to method 2");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        method1();
        System.out.println("main method executed after call to method 1");

    }
}

