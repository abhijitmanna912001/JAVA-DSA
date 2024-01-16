// https://leetcode.com/problems/magnetic-force-between-two-balls/description/
//             OR  
// https://www.geeksforgeeks.org/problems/aggressive-cows/0
// Solved these two using same logic

import java.util.Arrays;

public class AggressionCows {
    public static void main(String[] args) {

    }

    public static int solve(int n, int cows, int[] stalls) {
        if (stalls.length < cows) {
            return -1;
        }

        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAllocationPossible(stalls, mid, cows)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    static boolean isAllocationPossible(int stalls[], int minDistance, int cows) {
        int cowsCount = 1;
        int lastCowDistance = stalls[0];

        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] - lastCowDistance >= minDistance) {
                cowsCount += 1;
                lastCowDistance = stalls[i];
            }
            if (cowsCount >= cows) {
                return true;
            }
        }

        return false;
    }
}
