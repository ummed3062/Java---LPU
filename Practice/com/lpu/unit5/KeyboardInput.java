package com.lpu.unit5;

import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reading input from the keyboard
        System.out.println("Hello, "+ name);
    }
}
