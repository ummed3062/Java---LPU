package com.lpu;

public class ConditionalStatment {

    public static void main(String[] args) {
//        int marks = 85;
//        if (marks >= 90) {
//            System.out.println("Grade: A");
//        } else if (marks >= 75) {
//            System.out.println("Grade: B");
//        } else if (marks >= 50) {
//            System.out.println("Grade: C");
//        } else {
//            System.out.println("Grade: F");
//        }

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }


    }
}
