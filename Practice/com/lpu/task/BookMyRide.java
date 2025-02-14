package com.lpu.task;

public class BookMyRide{
    static int base_fare;

    public String status;
    public String riderName;
    public String driverName;
    public int distance;

    static{
        System.out.println("Setting the base fare");
        base_fare = 10;
    }


    {
        System.out.println("Initializing ride");
        status = "Confirmed";
        riderName = "Aman";
        driverName = "Shivam";
        distance = 5;

    }


    public BookMyRide(){
        System.out.println("The ride is created");
    }


    public void displayDetails(){
        System.out.println("Status of ride: " + status);
        System.out.println("Rider name: " + riderName);
        System.out.println("Driver name: " + driverName);
        System.out.println("Total fare: " + base_fare * distance);
    }

    public static void main(String[] args){
        BookMyRide ride = new BookMyRide();
        ride.displayDetails();

    }
}
