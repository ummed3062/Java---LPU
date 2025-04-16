package com.lpu.revise.unit3;

public class FinalKeyWordDemo {

    public static void main(String[] args) {

        Math.random();
        String str = "";
        final float pi = 3.14f;

    }
}

class Bank{
    final void basicDetails(){
        System.out.println("Basic Details");
    }
}

class SavingAccount extends Bank{

//    @Override
//    void basicDetails(){
//
//    }


}

class CurrentAccount extends Bank{

}
