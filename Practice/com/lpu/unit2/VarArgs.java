package com.lpu.unit2;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        printNumbers(1, 2, 3, 4); // Output: 1 2 3 4
        printDetails(  "Numbers are: ", 10, 20, 30 ); // Output: Numbers are: 10 20 30
//        demoVarargs(5, 10, 15); // Output: Total numbers: 3, First number: 5

        normalMethod(10, 20, 30);
    }
    public static void normalMethod(int... a){

        System.out.println(a);
    }

    public static void demoVarargs(int... nums) {
        System.out.println("Total numbers: " + nums.length);
        System.out.println("First number: " + nums[0]);
    }


    public static void printDetails(  String message,int... numbers) {
        System.out.println(message);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }




//    public static void printNumbers(int... numbers) {
//        for (int num : numbers) {
//            System.out.println(num);
//        }
//    }

    //    public static void methodName(dataType... variableName) {
//        // Code to process variable-length arguments
//    }





}
