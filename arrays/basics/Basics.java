package arrays.basics;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        Integer[] arr2 = new Integer[5];

        arr2[0] = 5;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // BELOW WITH THROW AN ERROR
        // if (arr1[0] instanceof Object) {
        // System.out.println("value inside arr1 is an object.");
        // }

        if (arr2[0] instanceof Object) {
            System.out.println("value inside arr2 is an object.");
        }
    }
}