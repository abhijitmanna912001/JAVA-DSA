// https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this question using below logic

import java.util.Arrays;

public class PairDiffernce {

    public static boolean findPair(int[] arr, int L, int N) {
        Arrays.sort(arr);
        int start = 0, end = 1;

        while (end < L && start < L) {
            int currentDiff = arr[end] - arr[start];

            if (currentDiff == N) {
                return true;
            } else if (currentDiff < N) {
                end++;
            } else {
                start++;
            }

            if (start == end) {
                end++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = { 5, 20, 3, 2, 5, 80 };
        int L1 = arr1.length;
        int N1 = 78;
        System.out.println(findPair(arr1, L1, N1)); // Output: true

        int[] arr2 = { 90, 70, 20, 80, 50 };
        int L2 = arr2.length;
        int N2 = 45;
        System.out.println(findPair(arr2, L2, N2)); // Output: -1
    }
}
