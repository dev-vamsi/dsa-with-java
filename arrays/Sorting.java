package arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 45, 22, 9, 11 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 10, 3, 45, 22, 9, 11 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestElem = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestElem])
                    smallestElem = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallestElem];
            arr[smallestElem] = temp;
        }
    }
}
