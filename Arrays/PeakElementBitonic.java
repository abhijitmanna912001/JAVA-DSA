// https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Solved these questions using below logic

public class PeakElementBitonic {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2 };
        int ans = findPeakElementBitonic(arr);
        if (ans == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println("Found element " + arr[ans] + " at index: " + ans);
        }
    }

    static int findPeakElementBitonic(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] > arr[prev]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
        // return 1 in leetcode question
    }
}
