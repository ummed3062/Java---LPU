package com.lpu.unit3;

// Parent class
class Ride {
    void calculateFare(int distance) {
        System.out.println("Ride fare for " + distance + " km is calculated.");
    }
}

// Child class for Economy ride
class EconomyRide extends Ride {

    @Override
    void calculateFare(int distance) {
        System.out.println("Economy ride fare for " + distance + " km: $" + (distance * 2));
    }
}

// Child class for Luxury ride
class LuxuryRide extends Ride {
    @Override
    void calculateFare(int distance) {
        System.out.println("Luxury ride fare for " + distance + " km: $" + (distance * 5));

    }
}

// Main application class
public class RideBookingAppOverriding {
    public static void main(String[] args) {
        Ride myRide; // Reference variable of parent class

        myRide = new EconomyRide();
        myRide.calculateFare(10); // Calls EconomyRide's method

        myRide = new LuxuryRide();
        myRide.calculateFare(10); // Calls LuxuryRide's method
    }
}

