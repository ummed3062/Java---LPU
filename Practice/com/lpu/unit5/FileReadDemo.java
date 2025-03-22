package com.lpu.unit5;

import java.io.*;
public class FileReadDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit5\\demo.txt")) {

            int content;

            System.out.println("file data: " + fis.read());
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}