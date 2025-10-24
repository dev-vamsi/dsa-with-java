package arrays;

public class Search {
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 10, 20, 33, 12, 65, 8 };

        System.out.println(linearSearch(arr1, 33));
        System.out.println(linearSearch(arr1, 3));

        int[] arr2 = new int[] { 10, 20, 33, 52, 65 };

        System.out.println(binarySearch(arr2, 20));
        System.out.println(binarySearch(arr2, 33));
        System.out.println(binarySearch(arr2, 52));
        System.out.println(binarySearch(arr2, 65));
        System.out.println(binarySearch(arr2, 10));
        System.out.println(binarySearch(arr2, 2));
    }
}
