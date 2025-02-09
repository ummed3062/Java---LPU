package com.lpu.unit2;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){

            if (i % 2 == 0){
                continue; // skip the rest of the loop for even numbers
            }
            System.out.println("even number: " + i);
        }
    }
}
