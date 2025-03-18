package com.lpu.unit4.utilityclasses;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeDateDemo {

    public static void main(String[] args) {

        Date date = new Date();

//        java.time
//        LocalDate
//        LocalTime - (h, m, s)
//        LocalDateTime (y, m, d, h, m, s)
//        ZonedDateTime


        LocalDate today = LocalDate.now();


        System.out.println(today);

        LocalDate specficDate = LocalDate.of(2020, 12, 13);


        LocalTime currentTime = LocalTime.now();

        LocalTime time = LocalTime.of(10, 25, 12);
        System.out.println(currentTime);

        LocalDateTime lDateTime = LocalDateTime.now();

        System.out.println(lDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);


        Instant instant = Instant.now();

        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String strDateTime = lDateTime.format(formatter);


        System.out.println(strDateTime);


        LocalDate currentD = LocalDate.of(2024, 2, 27);


        LocalDate nextWeek = currentD.plusDays(7);
        System.out.println(nextWeek);


        LocalDate sDate = LocalDate.of(2025, 3, 03);
        LocalDate eDate = LocalDate.of(2025, 5, 10);


//        Period period = Period.between(sDate, eDate);

//        System.out.println(period.getMonths());

        LocalDate startDate = LocalDate.of(2025, 2, 15);
        LocalDate endDate = LocalDate.of(2025, 2, 25);


        Period period = Period.between(startDate, endDate);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());



        Date d = new Date();
        System.out.println(d);

        d.getDate();


        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date: " + calendar.getTime());


        calendar.add(Calendar.DAY_OF_MONTH, 7);

        System.out.println("Date After 7 Days: " + calendar.getTime());















    }
}
