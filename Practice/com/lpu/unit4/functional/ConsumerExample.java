package com.lpu.unit4.functional;

import java.util.function.Consumer;
public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        printMessage.accept("Hello, Java!"); // Output: Message: Hello, Java!
    }
}

