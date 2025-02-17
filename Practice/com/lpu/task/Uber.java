package com.lpu.task;

public class Uber{




    public static void main(String[] args) {


        BookARide user1 = new BookARide("sec 168, noida", "sec 62, noida");

        BookARide user2 = new BookARide("sd", "sd");
    }
}

class BookARide{

    String pickUpLocation;
    String dropLocation;


    BookARide(){

    }

    BookARide(String pickUpLocation, String dropLocation){
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
    }

    public void confirmRide(){

        System.out.println("confirm ride");
    }

}
