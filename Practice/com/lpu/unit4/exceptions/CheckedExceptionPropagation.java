package com.lpu.unit4.exceptions;

import java.io.IOException;

class CheckedExceptionPropagation {
    static void method1() throws IOException {
        throw new IOException("File not found");
    }
    static void method2() throws IOException {
        method1(); // Propagates exception
    }
    public static void main(String[] args) {
        try {
            method2(); // Handles the propagated exception
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}

