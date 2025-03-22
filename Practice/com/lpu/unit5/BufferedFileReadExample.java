package com.lpu.unit5;

import java.io.*;
public class BufferedFileReadExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit5\\demo.txt"))) {

            System.out.println("file data: "+ reader.read());

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

