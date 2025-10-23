package arrays;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        // copy using iterations
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] copy1 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            copy1[i] = arr1[i];
        }

        // copy using System.arraycopy()
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] copy2 = new int[arr2.length];
        System.arraycopy(arr2, 0, copy2, 0, arr2.length);

        // copy using Arrays.copyOf()
        int[] arr3 = { 1, 2, 3, 4, 5 };
        int[] copy3 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(copy3));

        // copy using Arrays.copyOfRange()
        int[] arr4 = { 1, 2, 3, 4, 5 };
        int[] copy4 = Arrays.copyOfRange(arr4, 1, 4); // Copies elements from index 1 to 3
        System.out.println(Arrays.toString(copy4));

        // using Object.clone()
        // clone 1 :: for primitive types clone() clears a deep copy
        int[] arr5 = { 1, 2, 3, 4, 5 };
        int[] copy5 = arr5.clone();
        System.out.println(Arrays.toString(copy5));

        arr5[0] = 10;
        System.out.println(Arrays.toString(copy5));

        // clone 2 :: for non primitive types clone() clears a shallow copy
        int[][] arr6 = { { 1, 2 } };
        int[][] copy6 = arr6.clone();
        for (int[] a : copy6) {
            System.out.println(Arrays.toString(a));
        }

        arr6[0][0] = 10;
        for (int[] a : copy6) {
            System.out.println(Arrays.toString(a));
        }
    }
}
