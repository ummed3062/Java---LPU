package com.lpu.unit5;

import java.io.*;
public class FileWriteDemo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, File I/O!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

