package com.lpu.unit5;

import java.io.*;
public class FileReadExample {
    public static void main(String[] args) {
        try  {

            FileReader file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit5\\demo.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;

            String str;
            System.out.println(file);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

