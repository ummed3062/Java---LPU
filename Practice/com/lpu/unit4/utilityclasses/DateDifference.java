package com.lpu.unit4.utilityclasses;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 5, 15);
        LocalDate endDate = LocalDate.of(2025, 2, 25);

        Period period = Period.between(startDate, endDate);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());
    }
}

