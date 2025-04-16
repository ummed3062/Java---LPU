package com.lpu.revise.unit2;

import java.util.ArrayList;
import java.util.List;

public class OOPSDemo {

    public static void main(String[] args) {

        Student stu1 = new Student();
        System.out.println(stu1.name);

        Student stu2 = new Student();

        List<Integer> list = new ArrayList<>();
        list.add(10);

    }
}




interface LPU{

    void basicDetail();
}




class Student implements LPU{

    String name;
    void details(){
        System.out.println("Details method");
    }

    Student(){

    }

    @Override
    public void basicDetail() {

    }
}


//function {
//
//}
//
//function{
//
//}
