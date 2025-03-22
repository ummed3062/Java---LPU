package com.lpu.unit4.utilityclasses;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20};
        ArrayList<String> companies = new ArrayList<>();

        companies.add("Google");
        companies.add("Microsoft");
        companies.add("OpenAI");

        System.out.println(companies.get(1)); // Output: Microsoft
    }
}

