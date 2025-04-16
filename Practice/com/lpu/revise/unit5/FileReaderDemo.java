package com.lpu.revise.unit5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\revise\\unit5\\example.txt"))) {
            String line;

            FileReader file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\revise\\unit5\\example.txt");

//            FileReader obj = new FileReader("");
            System.out.println((char) file.read());




            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
