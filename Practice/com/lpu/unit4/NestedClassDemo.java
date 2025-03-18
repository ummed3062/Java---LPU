package com.lpu.unit4;

public class NestedClassDemo {

    static class Lpu{
        void display(){
            System.out.println("");
        }

        void library(){

            class Student{


            }

            class Books{

            }

        }

        void canteen(){

        }
    }



    public static void main(String[] args) {
        ByteXL.display();

    }
}

class ByteXL{
    static void display(){
        System.out.println("ByteXL....");
    }
}
