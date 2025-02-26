package com.lpu.oopsconcept;


class LpuMain{
    String location = "Punjab";

}

class LpuDelhi extends LpuMain{

    void display(){
        System.out.println("Main campus: " + location);
    }
}

class LpuRajasthan extends LpuMain{

    String location = "Rajsthan";
}



class EngineeringDepartment extends LpuDelhi{

    String hodOfEngDep = "Aakash";


}

public class InheritanceDemo {

    public static void main(String[] args) {

//        LpuDelhi lpuDelhi = new LpuDelhi();
//        lpuDelhi.display();


        EngineeringDepartment engDep = new EngineeringDepartment();
        System.out.println(engDep.hodOfEngDep);
        engDep.display();


        LpuDelhi lpuDelhi = new LpuDelhi();
        lpuDelhi.display();

        LpuRajasthan lpuRajasthan = new LpuRajasthan();
        System.out.println(lpuRajasthan.location);
    }
}
