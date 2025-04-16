package com.lpu.revise.unit2;

public class InitializerBlockDemo {
    String name;
    InitializerBlockDemo(String name){
        this.name = name;
        System.out.println("Constructor Executed");
    }
    {
        System.out.println("Initializer Block Executed: " + name);
    }

    static {
        System.out.println("Static Initializer Block Executed");
    }
    public static void main(String[] args) {

//        InitializerBlockDemo obj = new InitializerBlockDemo("Ummed Singh");
    }
}
