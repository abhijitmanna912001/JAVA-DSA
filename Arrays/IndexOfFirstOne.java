// https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// Solved this question using below logic

public class IndexOfFirstOne {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
        findfirstOneBinaryInfiniteSorted(arr);
    }

    static void findfirstOneBinaryInfiniteSorted(int arr[]) {
        int range[] = findRangeInfinite(arr, 1);
        int ans = binarySearchFirstOccur(arr, 1, range[0], range[1]);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element at index: " + ans);
        }
    }

    static int binarySearchFirstOccur(int arr[], int target, int start, int end) {
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int[] findRangeInfinite(int arr[], int target) {
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            start = end;
            end = 2 * end;
        }

        range[0] = start;
        range[1] = end;

        return range;
    }
}
