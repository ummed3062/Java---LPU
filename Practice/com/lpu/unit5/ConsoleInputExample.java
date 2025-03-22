package com.lpu.unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");


        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = buffReader.readLine();
            System.out.println("User Input with the help of BufferReader class: "+ str);
        }catch (Exception e){

            System.out.println(e.getMessage());
        }



        String college = "LPU";
        int courseNumber = 10;
        System.out.println("College name: "+ college);

        System.out.printf("Courses number: %d , College name: %s", courseNumber, college);


        scanner.close();

    }
}

