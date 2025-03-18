package com.lpu.revise;

import java.util.Scanner;

public class EnumMain {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);


        for (Day day: Day.values()){

            String dayStr = day.toString();

            if (str.equals(dayStr)){
                System.out.println("Day is matched");
            }else {
                System.out.println("not matched");
            }

        }

        Day today = Day.MONDAY;



        String todayString = today.toString();

        System.out.println(str.equals(todayString));




        display();
    }


    static void display(){

        System.out.println(WithoutEnumPrbmDemo.MONDAY);




        for (Day day: Day.values()){
            System.out.println(day);
        }


    }
}
