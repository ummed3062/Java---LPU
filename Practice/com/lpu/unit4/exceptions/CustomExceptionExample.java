package com.lpu.unit4.exceptions;

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message); // Pass message to Exception class

    }
}

public class CustomExceptionExample {
    // Method that throws the custom exception
    static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            validate(16); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

