package com.singh;

class StaticBlockExample {
    static int number;

    static {
        number = 10;
        System.out.println("Static block executed.");
    }
    public static void main(String[] args) {
        System.out.println("Number: " + number);
    }
}
/* OUTPUT
    Static block executed.
    Number: 10
 */
