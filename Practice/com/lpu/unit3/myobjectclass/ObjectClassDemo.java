package com.lpu.unit3.myobjectclass;


class Lpu{
    String name = "lpu";
    void display(){
        System.out.println(name);
    }
}

class ByteXL extends Lpu{
    void display(){
        System.out.println("ByteXL");
    }
}
public class ObjectClassDemo {
    public static void main(String[] args) {

        Object lpu = new Lpu();






        Object byteXL = new ByteXL();

    }
}
