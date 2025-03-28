package com.lpu.unit4.exceptions;


class ByteXL {
    ByteXL(){
        System.out.println("Constructor block executed");
    }
    void display(){
        System.out.println("Display Method executed");
    }
}

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

//        ByteXL obj = new ByteXL();
//        obj.display();

//        MyResource obj = new MyResource();
//        obj.doSomething();
//        obj.close();


        try (MyResource res = new MyResource()) {
            res.doSomething();
        }
    }
}
