package com.lpu.unit2;

public class BreakStatment {

    public static void main(String[] args) {


//        for (int j = 0;j<10;j++){
//            for (int i=0;i<10;i++){
//                if (i==5){
//                    break;
//                }
//                System.out.println("Iteration of i: " + i);
//            }
//
//            System.out.println("Iteration of j: " + j);
//        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                 break;// Exits after matching the case

            case 4:
                System.out.println("Thrusday");
                break;
            default:
                System.out.println("Another day");
        }

        System.out.println("outer switch");

    }
}
