package com.lpu.unit4.utilityclasses;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDifference {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(14, 45);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Hours: " + duration.toHours() + ", Minutes: " + duration.toMinutes());
    }
}

