package arrays.problems;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }

            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
