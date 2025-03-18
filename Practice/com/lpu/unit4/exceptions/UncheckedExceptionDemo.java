package com.lpu.unit4.exceptions;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class UncheckedExceptionDemo {
    static void check(int number) {
        if (number < 0) {
            throw new CustomUncheckedException("Number must be positive");
        }
    }

    public static void main(String[] args) {
        check(-5); // No need for try-catch, will terminate the program
    }
}

