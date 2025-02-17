package com.lpu.unit3;

// Interface for sending messages
interface Sendable {
    void send(String message);
}

// Interface for receiving messages
interface Receivable {
    void receive();
}

// Class implementing both interfaces
class Email implements Sendable, Receivable {
    private String inboxMessage;

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
        inboxMessage = message; // Simulating sending an email
    }

    @Override
    public void receive() {
        if (inboxMessage != null) {
            System.out.println("Received Email: " + inboxMessage);
        } else {
            System.out.println("No new emails.");
        }
    }
}

// Main class to test the implementation
public class MessagingSystem {
    public static void main(String[] args) {
        Email email = new Email();
        email.send("Hello, this is a test email.");
        email.receive();
    }
}

