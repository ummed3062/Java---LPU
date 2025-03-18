package com.lpu.unit4.exceptions;

class MyResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Resource is working");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

public class CustomResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.doSomething();
        }
    }
}
