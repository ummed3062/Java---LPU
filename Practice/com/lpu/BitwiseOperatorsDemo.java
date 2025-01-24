package com.lpu;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        // Define two numbers




        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("Bitwise Operators in Java\n");

        // Bitwise AND (&)
        int andResult = a & b; // 0101 & 0011 = 0001 (Decimal 1)
        System.out.println("a & b = " + andResult);

        // Bitwise OR (|)
        int orResult = a | b; // 0101 | 0011 = 0111 (Decimal 7)
        System.out.println("a | b = " + orResult);

        // Bitwise XOR (^)
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (Decimal 6)
        System.out.println("a ^ b = " + xorResult);

        // Bitwise Complement (~)
        int notResult = ~a; // ~0101 = 1010 (Two's complement: -6 in Decimal)
        System.out.println("~a = " + notResult);

        // Left Shift (<<)
        int leftShift = a << 1; // 0101 << 1 = 1010 (Decimal 10)
        System.out.println("a << 1 = " + leftShift);

        // Right Shift (>>)
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (Decimal 2)
        System.out.println("a >> 1 = " + rightShift);

        // Unsigned Right Shift (>>>)
        int unsignedRightShift = -5 >>> 1;
        // -5 = 11111111 11111111 11111111 11111011 (32-bit)
        // Shifted: 01111111 11111111 11111111 11111101 (Decimal 2147483645)
        System.out.println("-5 >>> 1 = " + unsignedRightShift);

        // Explanation of binary representation
        System.out.println("\nBinary Representations:");
        System.out.println("a (5) in binary: " + Integer.toBinaryString(a));
        System.out.println("b (3) in binary: " + Integer.toBinaryString(b));
        System.out.println("-5 in binary: " + Integer.toBinaryString(-5));
    }
}

