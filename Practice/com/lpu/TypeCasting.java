//package com.lpu;
//
//public class TypeCasting {
//
//    public static void main(String[] args) {
//
//        byte b = 10;
//        int i = b;
//        long l = i;
//        System.out.println(l);
////        char c = 'A';
////
////        float cA = c;
////        System.out.println(cA);
////
//
////
////        float f = l;
////
////        System.out.println("b = "+ b);
////        System.out.println("i = "+ i);
//
//
////        byte -> short -> int -> long
//        int a = 129;
//        byte b = (byte) a;      // -128, -127.....0, 1,....127
//        System.out.println(b); //  a - b => 129 - 127 = 7
////        OUTPUT => -127
//
//
////        1 -> 1
////        2 -> 10
////        3 -> 11
//
////        int i = 723675225; // 01011101
////        short s = (short) i; // -32,678 - 32
//
////        System.out.println(s);
//
////        float f = 123.34f;
////        int i = (int) f;
////        System.out.println(i);
//
////        byte b1 = 10;
////        byte b2 = 20;
////        // Both b1 and b2 are promoted to int before addition
////        int result = b1 + b2;
////        System.out.println("byte to int: "+ result); // Output: 30
//
////        int i = 10;
////        long 1 = 20L;
////        // i is promoted to long, and result is long
////        long result = i + 1 ;
////        System.out.println("int to long: "+ result); // Output: 30
//
////        int i = 10;
////        float f = 3.14f;
////        float result = i + f; // i is promoted to float, and result is float
////        System.out.println("int to float: "+ result); // Output: 13.14
//
////        float f = 2.5f;
////        double d = 4.5;
////        double result = f + d; // f is promoted to double, and result is double
////        System.out.println("float to double: " + result); // Output: 7.0
//
////        char c1 = 'A'; // Unicode value is 65
////        char c2 = 'B'; // Unicode value is 66
////        int result = c1 + c2; // Both c1 and c2 are promoted to int
////        System.out.println("char to int: " + result); // Output: 131
//
////        byte b = 50;
////        char c = 'C'; // Unicode value is 67
////        int i = 1000;
////        long l = 1500001;
////        float f = 5.67f;
////        double d = 0.1234;
////        // Promotion hierarchy in this expression:
////        // b> int, c> int, int> long, long -> float, float -> double
////        double result = (f*b) + (i/c) - (d* l);
////        System.out.println("Complex promotion: "+ result);
////        // Output: 283.47660000000003 (may vary slightly due to floating-point arithmetic)
//
//
//        byte b = 10;
//        short s = 20;
//        int ans = b + s; // b(byte) -> b(int) + s(int) = int
//        System.out.println(ans);
//
//        int i = 10;
//        long l = 20;
//        double d = 30;
//
//        float f = i+l + (float)d; // i(float) + l(float)
//        System.out.println(f);
//
//
//
//
//
//
//    }
//}
