package com.lpu.unit4.exceptions;

import java.io.FileReader;

public class finallyBlockDemo {

    public static void main(String[] args) {
        FileReader file = null;
        try{
            file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\demo.txt");
            System.out.println("Network issue");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block executed");
            try {
                file.close();
                System.out.println("file close successfully");
            }catch (Exception e){
                System.out.println("catch block of finally block");
            }

        }
    }
}
