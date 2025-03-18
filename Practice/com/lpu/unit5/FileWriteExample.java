package com.lpu.unit5;

import java.io.*;
public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, Java File Handling!");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

