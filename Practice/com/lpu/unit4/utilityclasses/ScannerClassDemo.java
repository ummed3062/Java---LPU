package com.lpu.unit4.utilityclasses;

import java.util.Scanner;

public class ScannerClassDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();

        System.out.println("Enter name");
        String str = sc.nextLine();

        System.out.println("hello "+ str);

    }
}
