package com.lpu.unit4.utilityclasses;

import java.time.ZonedDateTime;
import java.time.ZoneId;
public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + zdt);

        ZonedDateTime specificZoneTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in New York: " + specificZoneTime);
    }
}

