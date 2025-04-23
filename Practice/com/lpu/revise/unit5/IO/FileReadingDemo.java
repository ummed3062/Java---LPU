package com.lpu.revise.unit5.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\revise\\unit5\\IO\\demo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
