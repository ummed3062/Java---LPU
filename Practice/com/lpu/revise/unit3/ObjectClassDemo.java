package com.lpu.revise.unit3;

public class ObjectClassDemo {
    public static void main(String[] args) {


//        String str = "LPU";
//        ObjectDemo obj1 = new ObjectDemo();
//        ObjectDemo obj2 = new ObjectDemo();
//        ObjectDemo obj3 = obj1;
//
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());
//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1.equals(obj3));
//
//        System.out.println(obj1);
//        System.out.println(obj1.toString());
//
//        ObjectParent objP = new ObjectParent();
//        System.out.println(objP.getClass().getSimpleName());





    }
}

class ObjectParent implements Cloneable{
    static void display(){

    }
}

class ObjectDemo extends ObjectParent{

    void task(){
        //1.
        ObjectParent obj = new ObjectParent();
        obj.display();

//        2
        ObjectParent.display();

//        3. Inheritance
        display();
    }

}
