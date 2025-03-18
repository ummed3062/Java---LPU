package com.lpu.unit4.exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileExample {

    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\nonexistent.txt");

            System.out.println("Network...issue");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }finally {
            try {
                System.out.println("Finally block executed");
                file.close();
                System.out.println("File closed.");
            }catch (Exception e){
                System.out.println("Error....." + e.getMessage());
            }

        }
    }
}
