package com.lpu.unit4.exceptions;
import java.io.*;
public class MultipleResourcesExample {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("F:\\ByteXL\\Java LPU\\Practice\\com\\lpu\\unit4\\exceptions\\demo.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

