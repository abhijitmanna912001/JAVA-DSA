// https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1148632940/
// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
// Solved these two GFG and Leetcode questions using below logic

public class SingleElementSorted {
    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return nums[start];
    }
}
