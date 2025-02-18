package com.lpu.unit3;


class LpuPunjab{

    final void display(){
        System.out.println("Lpu Punjab");
    }
}

class LpuRajasthan extends LpuPunjab{

//    @Override
//    void display(){
//        System.out.println("Lpu Rajasthan");
//    }
}
public class FinalKeyDemo {

    public static void main(String[] args) {


        int age = 24;
        final int rollNumber = 110;

        age = 25;
        System.out.println(age);

//        rollNumber = 100;    Error: due to final keyword


    }


    final void display(){

        System.out.println("Display.....");
    }


}
