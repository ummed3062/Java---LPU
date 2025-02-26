package com.lpu.oopsconcept;


interface IITDelhi{

    default void engineeringDepartment(){
        System.out.println("Engineering Department of IIT Delhi");
    }
}

interface IITBombay{

    default void engineeringDepartment(){
        System.out.println("Engineering Department of IIT Bombay");
    }
}


class NIT implements IITBombay, IITDelhi{


    @Override
    public void engineeringDepartment() {
        IITBombay.super.engineeringDepartment();
    }
}



public class MultipleInheritanceDimondPrbm {

    public static void main(String[] args) {


        NIT nit = new NIT();
        nit.engineeringDepartment();
    }
}
