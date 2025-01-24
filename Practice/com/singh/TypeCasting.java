package com.singh;

public class TypeCasting {

    public static void main(String[] args) {

//  1. Implicit (Widening) Casting
//        byte to short, int, long, float, and double

        byte b = 10;
        int i = b;
        long l = b;
        float f = b;
        double d = b;

        System.out.println("byte = " + b + "float = "+ f);

//        char to int, long, float, and double

        char c = ' '; // A = 65, ' ' = 32
        float cToI = c;

        System.out.println(cToI);


//        ------------------------------------------
//  2. Explicit (Narrowing) Casting
//        double to float, long, int, short, byte, and char

        double dE = 10.234;
        int iE = (int)dE;
        System.out.println(iE);

        long lE = 823877423; // -> 0,1 ->
//        1 -> 01
//        2  = 010
//        823877423 = 10000111011
//        iEL = 11011
        short iEL =  (short) lE;

        System.out.println(iEL);

//        short to byte

        short s = 130; // 130 - 127 = 3
        byte by = (byte) s;  // -128, -127, -126..0, 1, 2....127

        System.out.println(by);

//         Type Promotion
//        Promotion to Larger Types:

        int iP = 734;
        long lP = 37763;

        long sum = iP + lP; //

        System.out.println(sum);

//        If one operand is float, the whole expression is promoted to float.

        float fP = 10.12f;
        int iP1 = 10; // -> 10.0
        System.out.println(fP+iP1);

        byte bCom = 40;
        char cCom = 'C'; // 67
        int iCom = 1000;
        long lCom = 50000L;
        float fCom = 63.3f;

        double dCom = (fCom*bCom) + (iCom/cCom);
//                         (float + byte) + (int/char)
//                          float + int
//        float + float = double
        System.out.println(dCom);



    }
}
