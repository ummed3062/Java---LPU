package com.lpu.unit2;

public class StringExa {
    public static void main(String[] args) {

//        String str = "Hello";
//        System.out.println(str);
//        System.out.println(str.length());
//        str = str.toUpperCase();
//        System.out.println(str);
//
//        str.concat(" world");
//        System.out.println(str);


//        String str = "Hello";
//        String str3 = new String(str);
//
//        char[] chArr = {'J', 'a', 'v', 'a'};
//        String str4 = new String(chArr);
//        System.out.println(str4);
//
//        byte[] bArr = {65, 66, 68};
//        String str5 = new String(bArr);
//        System.out.println(str5);


//        String str = "Hello";
//        System.out.println(str.length());
//
//        String str2 = str.concat(" World");
//        System.out.println(str2);
//
//        String s1 = "Java";
//        String s2 = "java";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//
//        System.out.println(s1.compareTo(s2));
//
//        System.out.println(s1.charAt(2));
//
//        System.out.println(s1.indexOf('a'));
//        System.out.println(s1.lastIndexOf('a'));
//
//        System.out.println(s1.substring(1, 3)); // 3-1 =2
//
//        System.out.println(s1.toUpperCase());
//
//        String str1 = "   Hello     World  ";
//        System.out.println(str1.trim());
//
//        System.out.println(str1.replace(' ', ':'));
//
//        String name = "Ummed,singh, Singh: Singh";
//        String[] arr = name.split(",");
//        for(String s: arr){
//            System.out.println(s);
//        }
//
//        String contact = new String("987654321");
//        int age = 24;


//        String str1 = "Hello";
//        String str2 = "Hello";
//
//        System.out.println(str1 == str2);
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str2));
//
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        System.out.println(str3 == str4);
//        System.out.println(System.identityHashCode(str3));
//        System.out.println(System.identityHashCode(str4));


        String s = new String("Hello");
        StringBuilder str = new StringBuilder(5);

        str.append("Hello World");
        System.out.println(str);

        str.insert(2, "Java ");
        System.out.println(str);


        StringBuffer st = new StringBuffer("Hello");

    }
}
