package com.lpu.oopsconcept;


class Lpu{
    String loction = "Punjab";

    static void display(){
        System.out.println("Punjab");
    }

    int contactNumber(){
        return 987654321;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Lpu lpu = new Lpu();
        lpu.display();

       Lpu.display();

        int contactNumber = lpu.contactNumber();
        System.out.println(contactNumber);
    }
}
