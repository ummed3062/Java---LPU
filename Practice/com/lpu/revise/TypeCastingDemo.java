package com.lpu.revise;

public class TypeCastingDemo {

    public static void main(String[] args) {

        byte b = 10;

        int i = b;

        long l = i;

        System.out.println(b);
        System.out.println(i);
        System.out.println(l);


        double d = 100.10;
        float f = (float) d;
        System.out.println(f);
        int a = 130;

        byte bDemo = (byte)a; //-128 to 127

        System.out.println(bDemo);


        byte b1 = 10;

        byte b2 = 20;

        int result = b1+b2;
        System.out.println(result);

        char c = 'A';
        int charResult = c+1; // A - 65 + 1 = 66

        System.out.println(charResult);


        float floatVal  =5.5f;
        double doubleVal = 2.2;

        double dResult = floatVal + doubleVal;


        String Class = "lpu";

    }
}
