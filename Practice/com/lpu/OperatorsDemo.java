package com.lpu;

// Ummed Singh
// Software Developer - ByteXL
public class OperatorsDemo {
    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 5;

//        System.out.println("Addition: "+ (a + b)); // 15
//        System.out.println("Subtraction: "+ (a - b)); // 5
//        System.out.println("Multiplication: "+ (a* b)); // 50
//        System.out.println("Division: " + (a/b)); // 2
//        System.out.println("Modulus: "+ (a%b)); // 0



//        int a = 10;
//        int b = 10;
//        System.out.println(a == b); // false
//        System.out.println(a != b); // true
//        System.out.println(a > b); // false
//        System.out.println(a < b); // true
//        System.out.println(a >= b);

        boolean a = true;
        boolean b = false;

//        A             B       &&      ||
//        true          true    true        true
//        true          false   false       true
//        false         true    false       true
//        true          true    true        true


//        System.out.println(a && b); // false
//        System.out.println(a || b); // true
//        System.out.println(!a); // false


//        int a1 = 5; // 0101 in binary
//        int b1 = 3; // 0011 in binary
//        System.out.println(a1 & b1); // 1 (0001)
//        System.out.println(a1 | b1); // 7 (0111)
//        System.out.println(a1^ b1); // 6 (0110)
//        System.out.println(~a1); // -6
//
//        int c = 10;
//        c += 5; // c = c + 5
//        c *= 3; // c = c * 3
//        System.out.println(c); // 15
////


        int d = 5;
        System.out.println(++d); // 6 d = 6 -> print 6
        System.out.println(d++);    // print = 6 -> d = 7


        System.out.println(d--); // print = 7 -> d = 6
        System.out.println(-d); // -6
//
//        int e = 10;
//        int f = (e > 5) ? 100 : 200;
//        System.out.println(f);
//
//
        int x = 5+2 * 3; // Multiplication has higher precedence than addition
        System.out.println(x); // 11

        int y = (5+2) * 3; // Parentheses change the order of operations
        System.out.println(y); // 21


    }

    public static int Maths(){

        return 1;

    }
}
