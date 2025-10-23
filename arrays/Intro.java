package arrays;

public class Intro {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(i, 2);
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
