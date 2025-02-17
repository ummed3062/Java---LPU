package com.lpu.task;

public class ReverseString {

    public static void main(String[] args) {

        String str = "2nd Unit completed";
         // completed Unit 2nd

        String ans = reverseString(str);
        System.out.println(ans);

        // 1. split = [2nd, Unit, completed]
//        2. reverse for loop - revStr += arr[lastInd] + " ";

    }
    public static String reverseString(String str){
        String revStr = "";
        String[] strArr = str.split(" ");
        for (int i=strArr.length-1;i>=0;i--){
            revStr += strArr[i] + " ";
        }

        return revStr;
    }
}
