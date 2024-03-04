// https://leetcode.com/problems/container-with-most-water/description/
// https://www.geeksforgeeks.org/problems/container-with-most-water0535/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved both GFG and LeetCode question using below logic

public class ContainerMostWater {

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = 0;

        while (start < end) {
            int width = end - start;
            int containerHeight = Math.min(height[start], height[end]);
            int currentWater = width * containerHeight;
            maxWater = Math.max(maxWater, currentWater);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height1)); // Output: 49

        int[] height2 = { 1, 1 };
        System.out.println(maxArea(height2)); // Output: 1
    }
}
