package com.lpu.unit5.generics;

public class GenericsType<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Ummed"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Ummed"); //valid
        type1.set(24); //valid and autoboxing support
        type1.set(26);

        System.out.println(type1.get());
    }
}
