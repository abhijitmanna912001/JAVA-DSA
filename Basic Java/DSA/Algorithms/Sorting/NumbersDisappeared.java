// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// Solved this question using below logic

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }

        return list;
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