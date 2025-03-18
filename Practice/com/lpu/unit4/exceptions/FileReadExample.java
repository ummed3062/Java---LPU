package com.lpu.unit4.exceptions;

import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        FileReader file = null;
        try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        ) {

            System.out.println(br.readLine()); // Reading file content
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

