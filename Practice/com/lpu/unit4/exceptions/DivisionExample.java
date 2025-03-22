package com.lpu.unit4.exceptions;

public class DivisionExample {
    public static void main(String[] args) {
        try {
//            int result = 10 / 0;  // Throws ArithmeticException
//            System.out.println(result);
        }catch (Exception e){
            System.out.println("Arithmetic Exception");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block executed");
        }

    }
}
