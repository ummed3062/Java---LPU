package com.lpu.unit4.utilityclasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

//        Patterns
//        1. yyyy-mm-dd
//        2. dd/MM/yyyy
//        3. EEEE, MMM, dd, yyyy

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = now.format(formatter);

        System.out.println("Formatted Date: " + formattedDate);
    }
}

