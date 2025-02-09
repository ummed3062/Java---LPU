package com.lpu.unit2;

public class ThisKeywordDemo{

    String name;

    public void display(){
        System.out.println("Name: "+ name);
    }

    public ThisKeywordDemo setName(String name) {
        this.name = name;
        return this; // Returns the current object
    }
    public static void main(String[] args) {

        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.display();

        obj.setName("Ummed Singh").display();
    }

}

//class LPUByteXL{
//    static void display(){
//        System.out.println("Display LPUBYTEXL method executed");
//    }
//}
