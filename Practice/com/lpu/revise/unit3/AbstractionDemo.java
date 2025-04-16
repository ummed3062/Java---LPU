package com.lpu.revise.unit3;

import java.util.ArrayList;
import java.util.List;

public class AbstractionDemo {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);





        AbstractionCheck obj = new AbstractionCheck();
        obj.display();

        InterfaceDemo obj1 = new InterfaceImpl();
        obj1.basicDetails();
        obj1.check();

        List<Integer> list = new ArrayList<>();
        list.add(10);

//        AbstractClassDemo aCObj = new AbstractClassDemo();

//        InterfaceDemo iDObj = new InterfaceDemo();

        AbstractClassDemo acObj = new AbstractionCheck();
        acObj.BasicDetails();


    }
}


abstract class AbstractClassDemo{
    int a;
    abstract void BasicDetails();
    void display(){

    }

    AbstractClassDemo(){

    }
}

interface InterfaceDemo{

//    InterfaceDemo(){
//
//    }
//    int a;
    String check();
    void basicDetails();
    default void display(){

    }
}

class InterfaceImpl implements InterfaceDemo{

    @Override
    public String check() {
        return null;
    }

    @Override
    public void basicDetails() {

    }
}

class AbstractionCheck extends AbstractClassDemo{
    @Override
    void BasicDetails() {

    }

    void display(){
//
//
//
//
//
    }
}
