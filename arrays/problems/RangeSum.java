package arrays.problems;

// Problem Link: https://leetcode.com/problems/range-sum-query-immutable/

class NumArray {
    int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }

    public void updateArray(int index, int value) {
        int actualValue = prefixSum[index];
        if (index != 0)
            actualValue -= prefixSum[index - 1];
        for (int i = index; i < prefixSum.length; i++) {
            prefixSum[i] += value - actualValue;
        }
    }

    public void printPrefixArray() {
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + ",");
        }
    }
}

public class RangeSum {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray numArr = new NumArray(nums);

        int[][] testcases = { { 0, 2 }, { 2, 4 }, { 3, 5 }, { 0, 4 }, { 0, 1 } };

        for (int i = 0; i < testcases.length; i++) {
            System.out.print(numArr.sumRange(testcases[i][0], testcases[i][1]) + ",");
        }
        System.out.println();

        numArr.updateArray(2, 5);
        numArr.printPrefixArray();
    }
}