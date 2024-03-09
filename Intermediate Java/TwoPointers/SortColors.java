// https://leetcode.com/problems/sort-colors/
// Solved using 2 pointer approach

public class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int i = 0;
        while (i <= end) {
            if (nums[i] == 0) {
                swap(nums, i, start);
                start++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, end);
                end--;
            } else
                i++;
        }
        return;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

    }
}