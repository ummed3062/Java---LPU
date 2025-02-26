package com.lpu.unit4.lambdaExp;

import java.util.*;

public class SortingWithLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Manoj", "Sayandip", "Eshank");

        // Using Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println(names);
    }
}
