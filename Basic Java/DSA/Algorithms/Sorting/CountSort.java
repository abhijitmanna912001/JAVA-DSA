// https://www.geeksforgeeks.org/problems/counting-sort/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// Solved GFG question using below logic

public class CountSort {
    public static void main(String[] args) {

    }

    public static int[] countingSort(int arr[]) {
        int n = arr.length;
        int k = Integer.MIN_VALUE;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }

        if (k == Integer.MIN_VALUE) {
            return res;
        }

        int countArr[] = new int[k + 1];

        for (int i = 0; i < n; i++) {
            int index = arr[i];
            countArr[index] += 1;
        }

        for (int i = 1; i <= k; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = n - 1; i >= 0; i++) {
            int val = arr[i];
            int countVal = --countArr[val];
            res[countVal] = val;
        }

        return res;
    }
}