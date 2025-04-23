package com.lpu.multithreading;

class MovieTicketBookingSystem implements Runnable{
    int availableTickets = 1;
    public synchronized void ticketBooking(){
        if (availableTickets > 0){
            System.out.println("Booking the ticket for: "+ Thread.currentThread().getName());
            availableTickets--;
            System.out.println("Ticket Booked Successfully for " + Thread.currentThread().getName() +", Available Tickets: "+availableTickets);
        }else {
            System.out.println("Ticket sold out for: " + Thread.currentThread().getName());
        }
    }
    @Override
    public void run() {
        ticketBooking();
    }
}
public class SynchronizationMain {
    public static void main(String[] args) {
        MovieTicketBookingSystem mTBS =  new MovieTicketBookingSystem();
        Thread user1 = new Thread(mTBS, "User1");
        Thread user2 = new Thread(mTBS, "User2");
//        user2.setPriority(Thread.MAX_PRIORITY);
//        user1.setPriority(Thread.MIN_PRIORITY);
        user2.start();
        user1.start();


    }
}
