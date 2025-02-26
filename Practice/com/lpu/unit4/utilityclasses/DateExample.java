package com.lpu.unit4.utilityclasses;

import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Gets the current date
        System.out.println("Today's Date: " + today);

        LocalDate specificDate = LocalDate.of(2025, 13, 25); // Creates a specific date
        System.out.println("Specific Date: " + specificDate);
    }
}

