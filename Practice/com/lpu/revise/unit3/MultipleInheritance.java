package com.lpu.revise.unit3;


// Parent Class 1							   Ummed Singh
interface A1 {
    void show();
}
// Parent Class 2
interface B1 {
    void show();
}

class C implements A1, B1{
    @Override
    public void show() {

    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        C cObj = new C();
        cObj.show();
    }
}
