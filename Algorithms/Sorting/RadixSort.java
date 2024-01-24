// https://www.geeksforgeeks.org/problems/radix-sort/1
// Solved this GFG question using below logic

public class RadixSort {
    public static void main(String[] args) {

    }

    public static void radixSort(int arr[]) {
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }

        if (maxEle == Integer.MIN_VALUE) {
            return;
        }

        for (int digit = 1; maxEle / digit > 0; digit *= 10) {
            countingSortDigit(arr, digit);
        }
    }

    public static void countingSortDigit(int arr[], int digit) {
        int n = arr.length;
        int k = 9;
        int res[] = new int[n];

        int countArr[] = new int[k + 1];

        for (int i = 0; i < n; i++) {
            int index = (arr[i] / digit) % 10;
            countArr[index] += 1;
        }

        for (int i = 1; i <= k; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            int countIndex = (arr[i] / digit) % 10;
            int countVal = --countArr[countIndex];
            res[countVal] = val;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }

    }
}
