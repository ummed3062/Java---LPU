package com.lpu.unit4.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            System.out.println(arr[1]); // Causes ArrayIndexOutOfBoundsException
//            int result = 10 / 0; // Causes ArithmeticException
            FileReader file = new FileReader("demo.txt");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
            System.out.println("Exception caught: " + e);
        }catch (Exception e){
            System.out.println("Exception");
        }


//        try {
//            // Some code
//        } catch (IOException | FileNotFoundException e) { // Compilation Error!
//            System.out.println("Exception caught: " + e);
//        }

    }
}

