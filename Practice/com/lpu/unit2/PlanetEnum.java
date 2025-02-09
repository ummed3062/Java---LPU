package com.lpu.unit2;

public enum PlanetEnum {
    MERCURY(3.301e+23, 2.4397e6),
    VENUS(4.867e+24, 6.0518e6),
    EARTH(5.972e+24, 6.371e6),
    MARS(6.417e+23, 3.3895e6);

    private final double mass;       // in kilograms
    private final double radius;     // in meters

    PlanetEnum(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceGravity() {
        final double G = 6.67430e-11; // gravitational constant
        return G * mass / (radius * radius);
    }
}

