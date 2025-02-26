package com.lpu.unit4.lambdaExp;

import java.util.*;

public class SortingWithAnonymous {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Manoj", "Sayandip", "Eshank");

        // Before Java 8
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names);
    }
}

