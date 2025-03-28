package com.lpu.unit5.generics;

import java.util.Arrays;
import java.util.List;

class MathUtils {
    public static double sumNumbers(List<? extends Number> numbers) {  // Accepts Numbers and its subclasses
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();  // Safe operation
        }
        return sum;
    }
}
public class UpperBoundedWildcardDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        List<String > strList = Arrays.asList("Hi", "Ummed");

        List<Object> objList = Arrays.asList(1);


        System.out.println("Sum (Integers): " + MathUtils.sumNumbers(intList));
        System.out.println("Sum (Doubles): " + MathUtils.sumNumbers(doubleList));

//        System.out.println("Sum (Integers): " + MathUtils.sumNumbers(strList));  //ERROR

    }

}
