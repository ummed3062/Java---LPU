package com.lpu.revise.unit2;

public class StringBuilderDemo {

    public static void main(String[] args) {


        String str = new String("Hello");
        System.out.println(System.identityHashCode(str));


        str = str.concat(" World");
        System.out.println(System.identityHashCode(str));


        StringBuilder strBuilder = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(strBuilder));
        strBuilder =  strBuilder.append(" World");
        System.out.println(System.identityHashCode(strBuilder));

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(System.identityHashCode(sb));
        sb.append(" World");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb);  // Output: Hello World

    }
}
