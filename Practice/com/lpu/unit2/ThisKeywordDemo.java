package com.lpu.unit2;

public class ThisKeywordDemo{
    String name;
    ThisKeywordDemo(){
    }
//    ThisKeywordDemo(String name){
//
////        this("Ansh", 20);
//        System.out.println("Name is: "+ name);
//        this.name = name;
//    }

//    ThisKeywordDemo(String name, int age){
//        System.out.println("Contstructor executed with 2 par");
//        this.name = name;
//    }
////    ThisKeywordDemo(String name, int age, int contact){
//        System.out.println("Name is: "+ name);
//        this.name = name;
//    }

//    public void anotherMethod(){
////        System.out.println("Another method executed");
////    }


    public void display(){
        System.out.println("Name: "+ this.name);
    }

//
    public ThisKeywordDemo setName(String name) {
        this.name = name;
        return this; // Returns the current object
    }
    public static void main(String[] args) {

        ThisKeywordDemo obj1 = new ThisKeywordDemo();
        obj1.display();
        obj1.setName("Ummed Singh").display();






//        ThisKeywordDemo obj2 = new ThisKeywordDemo("Singh");
//        obj2.display();


    }

}

//class LPUByteXL{
//    static void display(){
//        System.out.println("Display LPUBYTEXL method executed");
//    }
//}
