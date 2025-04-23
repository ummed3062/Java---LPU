package com.lpu.revise.unit5.generics;


class CustomMathematic<T extends Number>{
    private T num;

    CustomMathematic(){

    }
    public CustomMathematic(T num){
        this.num = num;
    }

    public double square(){
        return num.doubleValue() * num.doubleValue();
    }
}

public class MathematicalOperation {
    public static void main(String[] args) {

        CustomMathematic<Integer> list = new CustomMathematic<>();

        CustomMathematic<Float> listF = new CustomMathematic<>();
//        CustomMathematic<String> strList = new CustomMathematic<String>();
    }
}


//funtion f1{
//
//        }

