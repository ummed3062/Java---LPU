package com.lpu.unit4.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
        file.read();
    }
    public static void main(String[] args) {
        try {
            readFile(); // Must be handled because of throws
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

