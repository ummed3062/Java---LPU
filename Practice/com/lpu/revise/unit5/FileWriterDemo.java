package com.lpu.revise.unit5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){

            FileWriter obj = new FileWriter("output1.txt");
            obj.write("Hi, LPU");
            obj.close();

            writer.write("Hello, Java File Handling!");
            System.out.println("Data written successfully!");
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

