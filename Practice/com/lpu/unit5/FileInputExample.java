package com.lpu.unit5;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content); // Reading byte by byte
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
