package com.lpu.unit4.utilityclasses;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date: " + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("Date After 7 Days: " + calendar.getTime());
    }
}

