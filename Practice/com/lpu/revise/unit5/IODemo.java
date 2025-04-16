package com.lpu.revise.unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//        System.out.print("Please Enter the Value: ");
//        int num = sc.nextInt();
//
//        System.out.println("Please Enter val");
//        String val = sc.nextLine();

//        System.out.println("Entered value is: "+ num + ", "+ val );

//        System.out.print("Please Enter the Name: ");
//        String name = sc.nextLine();
//        System.out.printf("Name: %s, Age: %d", name, num);

        int num = sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println(num+name);


    }
}
