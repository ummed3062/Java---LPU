package com.lpu.unit3.finalkeyword;

import com.lpu.Main;

public class DatabaseConfig {
    static void display(){
        final int a = 100;
//        a = 200; //Cannot assign a value to final variable 'a'
        System.out.println(a);
    }

    public static void main(String[] args) {
        display();
    }


    public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";
}




class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
    // Cannot override display() method


//    @Override
//    public void display() {
//        super.display();
//    }
}




final class Utility {
    public static void printMessage(String msg) {
        System.out.println(msg);

        String str = "";




}

// class ExtendedUtility extends Utility {


 } // This would cause an error

//public final class String {
//    // Internal implementation
//}


class MyMath{

   void display(){

       Math.max(10, 20);
   }
}

















