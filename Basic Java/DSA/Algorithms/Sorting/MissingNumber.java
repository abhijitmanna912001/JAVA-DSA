// https://leetcode.com/problems/missing-number/description/
// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// https://www.geeksforgeeks.org/problems/missing-number4257/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// Solved these three questions using below logic

public class MissingNumber {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // for range 1 to N
        // for (int i = 0; i < n-1; i++) {
        //     actualSum += nums[i];
        // }

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}
