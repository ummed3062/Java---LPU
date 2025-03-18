package com.lpu.unit4.exceptions;
import java.io.*;
public class WithoutTryWithResources {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader file = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\demo.txt");
            br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        } finally {
            try {
                System.out.println("Finally block executed");
                if (br != null){
                    br.close(); // Manually closing the resource
                    System.out.println("File closed...");
                }

            } catch (IOException e) {
                System.out.println("Error while closing: " + e);
            }
        }
    }
}

