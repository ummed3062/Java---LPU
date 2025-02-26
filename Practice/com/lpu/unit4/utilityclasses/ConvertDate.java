package com.lpu.unit4.utilityclasses;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDate {
    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("Converted LocalDateTime: " + localDateTime);
    }
}


