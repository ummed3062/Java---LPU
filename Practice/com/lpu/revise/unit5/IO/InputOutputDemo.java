package com.lpu.revise.unit5.IO;

import com.lpu.unit2.PlanetEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("Entered number is: "+a);
        System.out.printf("Entered number is: %d", a);


        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str1 = rd.readLine();
            int b = rd.read();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
