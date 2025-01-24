package com.singh;

public class WrapperDemo {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper
//        int primitive = 10;
//        Integer wrapped = primitive;
//
//        // Unboxing: Wrapper to Primitive
//        Integer wrappedValue = 20;
//        int primitiveValue = wrappedValue;
//
//        System.out.println("Primitive: " + primitive + ", Wrapped: " + wrapped);
//        System.out.println("Wrapped: " + wrappedValue + ", Primitive: " + primitiveValue);

//        Integer num = 10;
//
//        System.out.println(System.identityHashCode(num));
//        num = num+ 5;
//
//        System.out.println(System.identityHashCode(num));
//        System.out.println(num);



        Integer num1 = 128;        //  -128 - 127     num1 = num2 -> 100
        Integer num2 = 128;
//        Integer num3 = 128;

        Integer num3 = 200;   // num3 -> 200
        Integer num4 = 200;   // num4 -> 200
//
//        int a = 12;
//        int b = 12;
//        System.out.println(a==b);


        int a = 5;
        System.out.println(++a);
        System.out.println(a);





//        System.out.println(num1.equals(num2));   // true   // - 2000
//        System.out.println(num1 == num2);       //  true
//
//        System.out.println(num3.equals(num4)); //  true
//        System.out.println(num3 == num4);      //  false


    }
}

