package com.lpu.unit4.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionWithThrow {
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("demo.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
