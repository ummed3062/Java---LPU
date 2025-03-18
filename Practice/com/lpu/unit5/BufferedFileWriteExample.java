package com.lpu.unit5;

import java.io.*;
public class BufferedFileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Java File Handling Example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

