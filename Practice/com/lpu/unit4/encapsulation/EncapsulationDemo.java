package com.lpu.unit4.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        EncapsulationEntity obj = new EncapsulationEntity();

        System.out.println();
        System.out.println(obj.clg);
        System.out.println(obj.getId());


    }
}

class EncapsulationEntity{
    private int id = 100;
    private String name = "Ummed Singh";
    String clg = "LPU";

   public int getId(){
       return this.id;
   }
    void setId(int id){
        this.id = id;
    }
}
