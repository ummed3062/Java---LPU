package com.lpu.oopsconcept;


//1. Method overloading
//2. Method Overriding


class PaymentGatway{

    void creditCard(long cardNumber, int cvv, String ExpDate){

        System.out.println();
    }

    void creditCard(int cvv){
        System.out.println();
    }

    void processPayment(){

        
    }


}

class HDFC extends PaymentGatway{

    @Override
    void processPayment() {
        System.out.println("");
    }
}

class sbi extends PaymentGatway{

    @Override
    void processPayment() {

    }
}
public class PolymorphismDemo {

    public static void main(String[] args) {

        PaymentGatway obj = new PaymentGatway() {
            @Override
            void processPayment() {

            }
        };
        obj.creditCard(712);
        obj.creditCard(9876543, 712, "12/2025");

        sbi sbi = new sbi();
        HDFC hdfc = new HDFC();

        hdfc.processPayment();


        sbi.processPayment();

    }
}
