package com.lpu.unit2;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring(beginIndex)
        System.out.println("Substring from index 7: " + str.substring(7));

        // 4. substring(beginIndex, endIndex)
        System.out.println("Substring (7,11): " + str.substring(7, 11));

        // 5. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 6. lastIndexOf()
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        // 7. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 8. equals()
        System.out.println("Equals 'Hello, Java!': " + str.equals("Hello, Java!"));

        // 9. equalsIgnoreCase()
        System.out.println("Equals Ignore Case 'hello, java!': " + str.equalsIgnoreCase("hello, java!"));

        // 10. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 11. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 12. trim()
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 13. replace()
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        // 14. replaceAll()
        System.out.println("Replace all 'a' with '*': " + str.replaceAll("a", "*"));

        // 15. split()
        String[] words = str.split(",");
        System.out.println("Split by ',': " + words[0] + " | " + words[1]);

        // 16. startsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // 17. endsWith()
        System.out.println("Ends with 'Java!': " + str.endsWith("Java!"));

        // 18. isEmpty()
        System.out.println("Is empty: " + str.isEmpty());

        // 19. matches()
        System.out.println("Matches regex '[A-Za-z, ]+': " + str.matches("[A-Za-z, ]+"));

        // 20. concat()
        System.out.println("Concatenation: " + str.concat(" Welcome!"));
    }
}

