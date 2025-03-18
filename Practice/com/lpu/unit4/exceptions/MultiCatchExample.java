package com.lpu.unit4.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 50; // Causes ArrayIndexOutOfBoundsException
            int result = 10 / 0; // Causes ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }


//        try {
//            // Some code
//        } catch (IOException | FileNotFoundException e) { // Compilation Error!
//            System.out.println("Exception caught: " + e);
//        }

    }
}

