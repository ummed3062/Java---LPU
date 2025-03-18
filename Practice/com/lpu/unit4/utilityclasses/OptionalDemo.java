package com.lpu.unit4.utilityclasses;

import java.util.Optional;
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.orElse("Default")); // Output: Hello
    }
}

