package com.lpu.unit3.myobjectclass;

class Audi {
    String model;

    Audi(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}

public class ObjectHashCodeExample1 {
    public static void main(String[] args) {
        Audi audi1 = new Audi("BMW");
        Audi audi2 = new Audi("BMW");

        System.out.println(audi1.hashCode()); // Same hash code
        System.out.println(audi2.hashCode()); // Same hash code



    }
}

