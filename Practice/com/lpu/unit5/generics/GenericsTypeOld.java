package com.lpu.unit5.generics;

public class GenericsTypeOld {
    private Object t;
    public Object get() {
        return t;
    }
    public void set(Object t) {
        this.t = t;
    }
    public static void main(String args[]){
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Ummed");
        String str = (String) type.get(); //type casting, error prone and can cause ClassCastException

        type.set(1);
        String str1 = (String) type.get();
    }
}
