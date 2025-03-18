package com.lpu.unit4.exceptions;

public class ExceptionPropagation {
    static void method1() {

        try {
            int result = 10 / 0; // ArithmeticException
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void method2() {
        method1(); // Exception propagates from method1
    }

    public static void main(String[] args) {


            method2(); // Exception reaches main()


    }
}

