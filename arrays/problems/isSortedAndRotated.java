package arrays.problems;

public class isSortedAndRotated {
    public static boolean check(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return true;

        int inversionCount = 0;

        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++inversionCount;
                if (inversionCount > 1)
                    return false;
            }
        }

        if (nums[0] < nums[n - 1]) {
            ++inversionCount;
        }

        return inversionCount <= 1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        System.out.println(check(arr));

        arr = new int[] { 3, 4, 5, 1, 2 };
        System.out.println(check(arr));

        arr = new int[] { 1, 2, 3 };
        System.out.println(check(arr));
    }
}
