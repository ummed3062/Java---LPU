package com.lpu.unit2;

public class ThisKeyDemo {
    public static void main(String[] args) {

        ThisTest obj = new ThisTest();
        obj.display();
        obj.setName("ByteXL").display();


//        ThisTest obj1 = new ThisTest("Ummed");
//        obj1.display();

//        ThisTest obj2 = new ThisTest("Singh");
//        obj2.display();
    }
}

class ThisTest{
    String name;
    ThisTest(){


    }
    ThisTest(String name){
       this.name = name;
    }


    public void display(){
//        this.lpu();
        System.out.println("Name: "+ name);
    }

    public void lpu(){
        System.out.println("lpu method executed");
    }

    public ThisTest setName(String name) {
        this.name = name;
        return this; // Returns the current object
    }
}
