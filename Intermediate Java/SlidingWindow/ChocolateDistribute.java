// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
// Solved using below logic

import java.util.*;

public class ChocolateDistribute {
    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (a.size() == 0) {
            return 0;
        }

        Collections.sort(a);
        long res = Long.MAX_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            int minElement = a.get(i);
            int maxElement = a.get(i + m - 1);
            res = Math.min(res, maxElement - minElement);
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
