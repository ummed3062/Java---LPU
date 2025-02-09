package com.lpu.unit2;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println(weekend);

        EnumMap<Day, String> dayType = new EnumMap<>(Day.class);
        dayType.put(Day.MONDAY, "Weekday");
        dayType.put(Day.SATURDAY, "Weekend");
        System.out.println(dayType);



//        for (PlanetEnum planet : PlanetEnum.values()) {
//            System.out.printf("%s: Mass = %e, Radius = %e, Surface Gravity = %f%n",
//                    planet, planet.getMass(), planet.getRadius(), planet.surfaceGravity());
//        }
    }
}

