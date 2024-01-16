// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// https://www.geeksforgeeks.org/problems/smallest-divisor/1
// Solved using the same below logic

public class SmallestDivisor {
    public static void main(String[] args) {
        
    }

    public int smallestThresholdDivisor(int nums[], int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > end) {
                end = nums[i];
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isDivisionPossible(nums, mid, threshold)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    public boolean isDivisionPossible(int nums[], int divisor, int threshold) {
        int sumofDivison = 0;

        for (int i = 0; i < nums.length; i++) {
            sumofDivison += nums[i] / divisor;
            if (nums[i] % divisor != 0) {
                sumofDivison += 1;
            }
            if (sumofDivison > threshold) {
                return false;
            }
        }

        return true;
    }
}
