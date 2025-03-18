package com.lpu.unit4.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine()); // Read and print first line
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

