package com.lpu.unit4.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\demo.txt")) {
            System.out.println(file.read()); // Read and print first line
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

