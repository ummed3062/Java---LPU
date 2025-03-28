package com.lpu.unit4.exceptions;

public class MulthipleCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            System.out.println(arr[1]); // ArrayIndexOutOfBoundsException
            int num = 10 / 0; // ArithmeticException
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2nd catch block");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Exception.....");
        }

    }
}

//_______________

//method1(){ }
//method2(){ }
//main(){
//_______________


