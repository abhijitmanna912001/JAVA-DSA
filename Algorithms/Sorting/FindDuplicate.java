// https://leetcode.com/problems/find-the-duplicate-number/
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// Solved these using below logic

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        int arr[] = nums;
        for (int i = 0; i < arr.length; i++) {
            int element = Math.abs(arr[i]);
            int actualIndex = element - 1;
            if (arr[actualIndex] < 0) {
                return element;
            }
            arr[actualIndex] = -1 * arr[actualIndex];
        }

        return -1;
    }
}
