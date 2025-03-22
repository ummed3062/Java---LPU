package com.lpu.revise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericsType<A, B> {

    private A t;
    public A get(){
        return this.t;
    }
    public void set(A t1){
        this.t=t1;
    }
    public static void main(String args[]){

        List<String> list = new ArrayList<>();
        GenericsType<String, String> type = new GenericsType<>();


        type.set("Ummed"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Ummed"); //valid
        type1.set(24); //valid and autoboxing support
    }

}
