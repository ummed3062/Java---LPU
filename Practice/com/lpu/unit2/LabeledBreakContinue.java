package com.lpu.unit2;

public class LabeledBreakContinue {

    public static void main(String[] args) {

//        label: // Defines a label
//        {
//// Code block
//            break label; // Breaks out of the labeled block
//            continue label; // Skips to the next iteration of the labeled loop
//        }


//        outer: // Label for the outer loop
//        for (int k =1;k<5;k++){
            outer:
            for (int i = 2; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == j) {
                        continue outer; // Breaks out of the outer loop
                    }
                    System.out.println("i = "+i+", j "+ j);
                }
            }


    }
}
