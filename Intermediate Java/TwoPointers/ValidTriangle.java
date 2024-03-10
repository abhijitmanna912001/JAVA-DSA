// https://leetcode.com/problems/valid-triangle-number/description/
// https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// Solved these questions using below logic

import java.util.*;

public class ValidTriangle {
    public static int findNumberOfTriangles(int arr[], int n) {
        int ans = 0;
        if (arr.length < 3)
            return ans;
        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    ans += (right - left);
                    right--;
                } else {
                    left++;
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}