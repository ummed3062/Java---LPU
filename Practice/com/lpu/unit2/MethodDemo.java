package com.lpu.unit2;

public class MethodDemo {
    public static void main(String[] args) {
        int res = calSum(10, 20);
        System.out.println(res);

        int res1 = calSum(10, 20, 30);
        System.out.println(res1);

//        int withinMain(){
//            System.out.println("Withinmain method executed");
//            return 1;
//        }
    }
    static  int calSum(int num1, int num2){
        System.out.println("calSum method executed with 2 par");
        int sum = num1+num2;
        return sum;
    }
    static  int calSum(int num1, int num2, int num3){
        System.out.println("calSum method executed with 3 par");
        int sum = num1+num2+num3;
        return sum;
    }
    static float calSum(double num1, int num2){
        System.out.println("calSum method executed with 2 par");
        double sum = num1+num2;
        return 1;
    }

    static void calMul(){
        return;
    }

    public String findRest(){
        return "rest1, rest2, rest3";
    }
    public String findRest(String location){

        return "rest1, rest2";
    }


}
