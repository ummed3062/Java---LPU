package com.lpu.unit3.polymorphism;

class Lpu{
    void student(){
        System.out.println("student");
    }
    void student(String name){
        System.out.println(name);
    }

    void student(String name, int rollNumber){
        System.out.println(name +" "+ rollNumber);
    }
    String name = "Aakash";
    String contact = "987654321";
    void basicDetails(){
        System.out.println(name + ", " + contact);
    }
}

class EngineeringDepartment extends Lpu{

    String rollNumber = "18Eb..110";
    String branch = "CSE";
    @Override
    void basicDetails(){
        System.out.println("Name: " + name);
        System.out.println("Branch: "+ branch);
    }

}



public class PolymorphismDemo {
    public static void main(String[] args) {


        Lpu lpu = new Lpu();
        lpu.student();
        lpu.student("Aakash");

        EngineeringDepartment engDep = new EngineeringDepartment();

        engDep.basicDetails();

    }
}


