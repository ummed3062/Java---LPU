package com.lpu.unit4.utilityclasses;

import java.time.LocalDateTime;
public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, 2, 25, 14, 30);
        System.out.println("Specific DateTime: " + specificDateTime);
    }
}


