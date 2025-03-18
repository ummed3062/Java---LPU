package com.lpu.revise;

public class AccessModifiers {
    protected static int num = 10;

    public static void main(String[] args) {

        CheckAccessModifiers obj  =new CheckAccessModifiers();
        System.out.println(obj.num);

    }

    void display(){
        System.out.println(num);
    }
}

class CheckAccessModifiers{
    protected int num = 10;

}

class child extends CheckAccessModifiers{

    void display(){
        System.out.println(num);
    }
}
