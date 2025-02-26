package com.lpu.unit4.utilityclasses;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Date After 7 Days: " + nextWeek);

        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Date One Month Ago: " + lastMonth);
    }
}

