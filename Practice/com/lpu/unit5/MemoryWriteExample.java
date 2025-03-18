package com.lpu.unit5;

import java.io.*;
public class MemoryWriteExample {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String message = "Stored in memory!";

        try {
            baos.write(message.getBytes());
            System.out.println("Data stored: " + baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

