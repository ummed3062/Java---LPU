package com.lpu.revise;

public class OOPsDemo {

    public static void main(String[] args) {
        Lpu lpu = new Lpu();
        lpu.display();

        display();

    }

    static void display(){

    }


}


class Lpu{

    int a = 1;

    Lpu(){
        System.out.println("Lpu constructor ");
    }

    Lpu(int a){

    }

    Lpu(int a, int b){

    }

    void display(){

        System.out.println("Lpu class....");
    }
}
