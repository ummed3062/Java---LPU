package com.lpu.revise.unit2;

public class ThisKeywordDemo {

    public static void main(String[] args) {

    }
}

class AnotherThisKeyClass{

//    AnotherThisKeyClass obj = new AnotherThisKeyClass();

    AnotherThisKeyClass anotherDisplay(){

        return this;
    }


}

class UseCaseOfThisKey extends AnotherThisKeyClass{
    String name;

    UseCaseOfThisKey(){
        this("ummed");
    }

    UseCaseOfThisKey(String name){
        this.name = name;
    }

    void display(){
        this.anotherDisplay();
    }

//    void anotherDisplay(){
//
//    }
}


