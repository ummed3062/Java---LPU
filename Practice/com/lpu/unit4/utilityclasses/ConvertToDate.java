package com.lpu.unit4.utilityclasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertToDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("Converted Date: " + date);
    }
}

