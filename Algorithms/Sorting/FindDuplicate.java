// https://leetcode.com/problems/find-the-duplicate-number/
// Solved this using below logic

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        cycleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }

        return 0;
    }

    public void cycleSort(int nums[]) {
        int n = nums.length;
        int index = 0;

        while (index < n) {
            int element = nums[index];
            int correctPos = element - 1;

            if (nums[index] != nums[correctPos]) {
                swap(nums, index, correctPos);
            } else
                index++;
        }
    }

    public void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
