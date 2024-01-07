// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/0
// Solved this GFG question

public class TotalOccurences {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int first = binarySearchFirstOccur(arr, 60, true);
        int last = binarySearchFirstOccur(arr, 60, false);
        if (first == -1) {
            System.out.println("Occurrence of target is: " + 0);
        } else {
            System.out.println("Occurrence of target is: " + (last - first + 1));
        }
    }

    static int binarySearchFirstOccur(int arr[], int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
        // if (ans == -1) {
        // System.out.println("Element not found");
        // } else {
        // System.out.println("Found element " + target + " at index: " + ans);
        // }
    }
}
