// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?page=1&category=sliding-window&sortBy=submissions
// Solved using below logics

import java.util.*;

public class MaxSumSubArray {

    // 1. Brute Force Method
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum sum of subarrays of size K
        for (int i = 0; i <= N - K; i++) {
            int sum = 0;
            // Calculate the sum of the current subarray of size K
            for (int j = i; j < i + K; j++) {
                sum += Arr.get(j);
            }
            // Update maxSum if the current sum is greater
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    // 2. Sliding Window Concept
    public static long maximumSumSubarray2(int K, ArrayList<Integer> Arr, int N) {
        long maxSum = 0, sum = 0;
        int index = 0;

        while (index < N && index < K) {
            sum += Arr.get(index);
            index++;
        }

        
        for (int i = 1; i < N - K + 1; i++) {
            int prevElement = Arr.get(i - 1);
            int nextElement = Arr.get(i + K - 1);
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

    }
}