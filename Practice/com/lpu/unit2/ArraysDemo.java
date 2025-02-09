package com.lpu.unit2;

import java.util.Arrays;

public class ArraysDemo {
//
    public static void main(String[] args) {

//        int a = 10;
////
//        int[] numbers = new int[5];

//        System.out.println(numbers.length);


//        numbers[0] = 10;
//        numbers[1] = 20;
//        System.out.println(numbers[6]);
//        int[] arr = {10, 20, 30, 40}; // len = 4, ind = 0 - 3
////
////        arr[1] = 100;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
////
//        for(int arrEle: arr){
//            System.out.println(arrEle);
//        }


//        System.out.println(arr[2]);

////        numbers[1] = 20;
////
//        int[][] matrix = new int[2][3];    // {{1, 2, 3},
////                                            // {4, 5, 6}}
//        matrix[0][0] = 1;
//        matrix[0][1] = 2;
//        matrix[0][2] = 3;
//        matrix[1][0] = 4;
//        matrix[1][1] = 5;
//        matrix[1][2] = 6;
//
//        System.out.println(matrix.length);
////
////// Output each element
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[0].length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println(); // Move to the next row
//        }

//        int[][] jaggedArray = new int[2][];
//
//        jaggedArray[0] = new int[3]; // First row has 3 columns
//        jaggedArray[1] = new int[2]; // Second row has 2 columns
//
//        jaggedArray[0][0] = 1;
//        jaggedArray[0][1] = 2;
//        jaggedArray[0][2] = 3;
////
//        jaggedArray[1][0] = 4;
//        jaggedArray[1][1] = 5;
//
////// Output each element
//        for (int row = 0; row < jaggedArray.length; row++) {
//            for (int column = 0; column < jaggedArray[row].length; column++) {
//                System.out.print(jaggedArray[row][column] + " ");
//            }
//            System.out.println(); // Move to the next row
//
//        }
//
        int[] numbers = {5, 3, 8, 1, 2};
//
//        String str = Arrays.toString(numbers);
//
//        System.out.println(Arrays.toString(numbers));




//
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
//
//
//        int[] numbers = {1, 2, 3, 5, 8};
//        int index = Arrays.binarySearch(numbers, 3);
//        System.out.println("Index of 3: "+ index); // Output: Index of 3: 2
//
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2)); // Output: true
//
//        int[] numbers = {1, 2, 3};
//        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4, 5]
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        int[] copy = Arrays.copyOf(numbers, 10);
//        System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3]
//
////        int[] numbers = {1, 2, 3, 4, 5};
////        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
////        System.out.println(Arrays.toString(subArray)); // Output: [2, 3, 4]
//
//        int[] data = {10, 5, 3, 8, 2};
//// Sorting the array
//        Arrays.sort(data);
//        System.out.println("Sorted Array: "+ Arrays.toString(data));
//// Searching for an element
//        int index = Arrays.binarySearch(data, 8);
//        System.out.println("Index of 8: "+ index);
//// Filling an array
//                Arrays.fill(data, 1);
//        System.out.println("Filled Array: "+ Arrays.toString(data));
//// Comparing arrays
//        int[] dataCopy = {1, 1, 1, 1, 1};
//        System.out.println("Arrays Equal: "+ Arrays.equals(data, dataCopy));
//
//        // Declaration, instantiation, and initialization
//        int[] scores = {85, 90, 78, 88, 76};
//// Accessing elements
//        System.out.println("First score:" + scores[0]);
//// Modifying an element
//        scores [2] = 80;
//// Change third score to 80
//        System.out.println("Modified third score: "+ scores[2]);
//// Finding the length of the array
//                System.out.println("Total scores: " + scores.length);
//// Sorting the array
//        Arrays.sort(scores);
//        System.out.println("Sorted scores: "+ Arrays.toString(scores));
//// Traversing using enhanced for loop
//                System.out.print("All scores: ");
//        for (int score :scores) {
//            System.out.print(score +" ");
//        }
    }
}
