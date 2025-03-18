package com.lpu.unit4.exceptions;

public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException



        try {
            int num = 10/0; // JRE - ArithmeticException Obj
            System.out.println(num);
        }
        catch ( IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("IndexoutofBound Exception");
        }
        finally {
            System.out.println("finally block Executed");
        }


    }
}
