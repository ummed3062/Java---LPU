package com.lpu.unit5;

import java.io.*;
public class FileWriteExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myoutput.txt"));
            writer.write("Hello, Java File Handling!");
            writer.write(10);
            System.out.println("Data written successfully!");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}

