package com.lpu.unit2;

public class JumpDemo {
    public static void main(String[] args) {
        System.out.println("Result: "+ checkNumber(5));
    }
     static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
            // Exits the method if the condition is true
        }

        return "Non-Positive";

//         System.out.println("ummed");
    }
}
