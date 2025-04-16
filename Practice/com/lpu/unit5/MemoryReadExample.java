package com.lpu.unit5;

import java.io.*;
public class MemoryReadExample {
    public static void main(String[] args) {
        byte[] data = "Hello, Memory!".getBytes();

        for (byte b: data){
            System.out.print(b+", ");
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(data);

        int content;
        while ((content = bais.read()) != -1) {
            System.out.print((char) content);
        }
    }
}

