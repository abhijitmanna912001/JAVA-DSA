// https://leetcode.com/problems/find-the-duplicate-number/
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// Solved these using below logic

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int element = Math.abs(nums[i]);
            int actualIndex = element - i;

            if (nums[actualIndex] < 0) {
                return element;
            }

            nums[actualIndex] = -1 * nums[actualIndex];
        }

        return 0;
    }
}
