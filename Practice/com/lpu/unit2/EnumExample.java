package com.lpu.unit2;

import com.sun.security.jgss.InquireType;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }

//        for (Day day : Day.values()) {
//            System.out.println(day);
//        }
//        System.out.println(Day.MONDAY.ordinal()); // Outputs: 0
//
        System.out.println(Day.FRIDAY.name()); // Outputs: FRIDAY
//
        System.out.println(Day.FRIDAY.toString());
//        System.out.println(Day.FRIDAY.name());
//        String dayFriday = Day.FRIDAY.name();

        System.out.println();
//
//        String dayFriday1 = Day.FRIDAY.toString();

        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);

        HashMap<String, String> hSet = new HashMap<>();

        hSet.put("Day1", "Monday");


    }
}
