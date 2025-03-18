package com.lpu.revise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40 ,50};

        int[] arr  = new int[5];

        System.out.println(numbers[0]);


        int[][] mat = new int[2][3];

        mat[0][0] = 10;
        mat[0][1] = 20;


        Scanner sc = new Scanner(System.in);



//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                mat[i][j] = sc.nextInt();
//            }
//            System.out.println(); // Move to the next row
//        }



        int[] array = {10, 40 ,20, 50, 30};

        Arrays.sort(array);

        for (int val: array){
            System.out.println(val);
        }



    }
}
