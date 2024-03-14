// https://leetcode.com/problems/max-consecutive-ones-iii/submissions/1198463780/
// https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1
// Solved these using below logic

public class MaximumConsecutive1s {
    // Using Two Pointer Concept
    public int longestOnes2(int[] nums, int k) {
        int start = 0;
        int maxLen = 0;
        int flippedOnes = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                flippedOnes++;
            }

            // Adjust the start pointer to maintain at most k flipped ones
            while (flippedOnes > k) {
                if (nums[start] == 0) {
                    flippedOnes--;
                }
                start++;
            }

            // Update the maximum length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    // Using sliding window concept
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int start = 0, end = 0;
        int ans_begin = 0, ans_end = -1;
        int flips = 0;

        while (end < n) {
            // Expand the window
            if (nums[end] == 0) {
                flips++;
            }

            while (flips > k) {
                // Contract the window
                if (nums[start] == 0) {
                    flips--;
                }
                start++;
            }

            // Update the answer if the current window is longer
            if (end - start + 1 > ans_end - ans_begin + 1) {
                ans_begin = start;
                ans_end = end;
            }

            // Move the end pointer to the next element
            end++;
        }

        // Calculate the length of the longest subarray
        int ans = ans_end - ans_begin + 1;

        return ans;
    }

    public static void main(String[] args) {

    }
}
