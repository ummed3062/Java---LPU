package com.lpu.unit2;

public class User extends AbstractDemo{

    private String name;

    User(){
        System.out.println("");
    }

    public  void LPU(String name, int studetId){

        name = "Ummed";

    }
    public void LPU(String name){

        System.out.println("Name");
    }

    @Override
    int display(int a) {
        return 0;
    }


    static class InnerClass{

        String a = "Ummed";





    }


    class InnerNormalClass{
        User obj = new User();



    }

//    Inner Classes: Non-static nested classes that have access to instance variables and methods of the outer class.


//    User user = new User(){
//
//        public void display(){
//
//        }
//    }

}






