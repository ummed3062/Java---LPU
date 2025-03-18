package com.lpu.unit4;


class OuterDemo {
    void display() {
        final String localMessage = "Inside Local Inner Class";
        String msg = "Hello LPU!";
        // Local Inner Class
        class LocalInner {
            void show() {
                System.out.println(localMessage);
                String str = localMessage;
                String s = msg;
            }
        }
        // Creating instance of LocalInner inside method
        LocalInner localObj = new LocalInner();
        localObj.show();
    }
}

public class LocalInnerDemo {
    public static void main(String[] args) {
        OuterDemo outerObj = new OuterDemo();
        outerObj.display();
    }
}

