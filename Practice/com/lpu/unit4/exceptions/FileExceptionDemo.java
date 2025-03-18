package com.lpu.unit4.exceptions;

import java.io.FileReader;

public class FileExceptionDemo {

    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new  FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\demo.txt");


        }catch (Exception e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }finally {
            try {
                System.out.println("Finally block executed");
                file.close();
                System.out.println("file closed");
            }catch (Exception e){
                System.out.println("error...");
            }




        }


    }
}
