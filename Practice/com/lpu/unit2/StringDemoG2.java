package com.lpu.unit2;

import java.util.Stack;

public class StringDemoG2 {

    static int age = 24;

    public static void main(String[] args) {
//        MyString str = new MyString();
//        int a = 10;
//        String name = "Aakash";

//        String s = new String();
//        System.out.println(s.length());
//
//        String litStr = "LPU";
//        System.out.println(litStr);
//
//        String anoStr = new String(litStr);
//        System.out.println(anoStr);
//
//        char[]  chArr = {'H', 'e', 'l', 'l', 'o'};
//        String chStr = new String(chArr);
//        System.out.println(chStr);
//
//        byte[] byArr = {65, 67, 70};
//        String byStr = new String(byArr);
//        System.out.println(byStr);


//        String clg = "lpu";
//
//        System.out.println(System.identityHashCode(clg));
////        clg += " ByteXL";
//
//        clg = clg.concat(" ByteXl");
//        System.out.println(clg);
//
//        System.out.println(System.identityHashCode(clg));


//        SCP

//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
//        System.out.println(System.identityHashCode(str1)); // 1705736037
//        System.out.println(System.identityHashCode(str2)); // 1705736037
//
//
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        System.out.println(str3 == str4);
//        System.out.println(System.identityHashCode(str3)); // 455659002
//        System.out.println(System.identityHashCode(str4)); // 250421012


//        intern() method

//        String str1 = new String("Hello"); // heap
//
//        String str2 = str1.intern(); // scp
//
//        String str3 = "Hello"; // scp
//
//        System.out.println(str1 == str3);
//        System.out.println(str2 == str3);


//        Methods of String class

//        String str = "lpu ByteXL";
//
//        System.out.println(str.length());
//
//        str = str.concat(" Punjab");
//        System.out.println(str);
//
//        String s1 = new String("lpu");
//        String s2 = new String("lpu");
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1 == s2);
//
//        System.out.println(s1.compareTo(s2));
//
//        String name = "Java";
//        System.out.println(name.charAt(1));
//
//        System.out.println(name.indexOf('a'));
//        System.out.println(name.lastIndexOf('a'));
//
//        System.out.println(name.substring(1, 3)); // 3 -1 = 2
//
//        System.out.println(name.toUpperCase());
//
//        String clg = "    lpu   ByteXL   ";
//        System.out.println(clg);
//        System.out.println(clg.trim());
//
//        System.out.println(clg.replace(' ', ','));
//
//        clg = "lpu ByteXL CSE";
//
//        String[] strArr = clg.split(" ");
//
//        for (String s: strArr){
//            System.out.println(s);
//        }

        String s = new String("Hello");
        s.concat(" World");
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        System.out.println(str);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append("  world");
        System.out.println();




    }
}

class MyString{

    public void display(){

        System.out.println("Display method");


    }


}
