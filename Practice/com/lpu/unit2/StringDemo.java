package com.lpu.unit2;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "Hello";  // Stored in SCP
        String s2 = "Hello";  // Reuses "Hello" from SCP
        System.out.println(s1 == s2); // true (same reference)
        System.out.println("Hashcode of s1 is: "+System.identityHashCode(s1));
        System.out.println("Hashcode of s2 is: "+System.identityHashCode(s2));
//        true
//        Hashcode of s1 is: 69609650
//        Hashcode of s2 is: 69609650

//        String s1 = new String("Hello");  // New object in Heap Memory
//        String s2 = new String("Hello");  // Another new object in Heap Memory
//        System.out.println(s1 == s2); // false (different references)
//        System.out.println("Hashcode of s1 is: "+System.identityHashCode(s1));
//        System.out.println("Hashcode of s2 is: "+System.identityHashCode(s2));
//        false
//        Hashcode of s1 is: 69609650
//        Hashcode of s2 is: 69609650



//        String s1 = "Java";
//        String s2 = "Java";
//
//        String s3 = new String("Java");
//        String s4 = new String("Java");
//
//        String s1 = new String("Hello");
//        String s2 = s1.intern(); // Places "Hello" in SCP if not present
//
//        String s3 = "Hello"; // Refers to SCP entry
//
//        System.out.println(s2 == s3); // true (both point to SCP)
//        System.out.println(s1 == s3); // false (s1 is still in heap)
//
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb); // "Hello World" (Modified in the same object)


//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb);  // Output: Hello World

//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World");
//        System.out.println(sb);  // Output: Hello World




    }
}
