package com.lpu.revise.unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InstanceOfOperatorDemo {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add(new CheckInstance());
        list.add(new CheckInstance());
        list.add(new CheckAnotherInstance());

        for (Object obj: list){
            if (obj instanceof CheckInstance){
                System.out.println("If block executed");
            }else {
                System.out.println("Else Block Executed");
            }
        }
        CheckInstance obj = new CheckInstance();
        System.out.println( obj instanceof CheckInstance);
    }
}

class CheckInstance{

}

class CheckAnotherInstance{

}
