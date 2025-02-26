package com.lpu.unit3;


class LpuCollege{
    String directorName = "Mr Dr.Ashok Kumar Mittal Sir";
}
class EngineeringDepart extends LpuCollege{
    String hod = "";
    void display(){
        System.out.println(directorName);
    }
}

class ManagementDepartment extends LpuCollege{
    void display(){
        System.out.println(directorName);
    }
}
public class LpuManagementSystem {
    public static void main(String[] args) {
        ManagementDepartment obj = new ManagementDepartment();
        obj.display();
    }

}




