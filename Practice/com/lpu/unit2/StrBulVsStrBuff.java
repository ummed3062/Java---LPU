package com.lpu.unit2;

public class StrBulVsStrBuff {

    public static void main(String[] args) {

        StrTest user1 = new StrTest();
        user1.display();

        StrTest user2 = new StrTest();
        user2.display();

        Thread t = new Thread();
        t.start();

    }
}

class StrTest{
    StringBuilder str = new StringBuilder("");
    StringBuffer strBuf = new StringBuffer("");

    public void display(){

        for (int i = 0; i<100;i++){
            str.append(i);
            strBuf.append(i);
        }

    }

}
