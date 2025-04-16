package com.lpu.revise.unit2;

public class StringExample {

    public static void main(String[] args) {

        String str1 = new String("LPU");
        String str2 = new String("LPU");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String strLiteral = "Java";

        char[] ch = {'j', 'a'};

        String strNewKey = new String(ch);

        String str = "Java";

        System.out.println("Last index of 'a': " + str.indexOf('a'));

        System.out.println(str.contains("aJ"));

        System.out.println("Replace all 'a' with '*': " + str.replaceAll("a", "*"));

        String lang = "Java, Python, C, C++";

        String[] langArr = lang.split(",");

        System.out.println(langArr[1]);

        System.out.println("Starts with 'Hello': " + lang.endsWith("C++"));

        str = "123";
        System.out.println("Matches regex '[A-Za-z, ]+': " + str.matches("[A-Za-z, ]+"));


        int a = 10;

        String str3 = "";
        StringDemo obj = new StringDemo();
    }
}
