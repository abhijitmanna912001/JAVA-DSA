// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this question using below logic

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 11, 45, 87, 90 };
        int arr2[] = { 90, 87, 45, 11, 7, 5, 2 };
        // binarySearch(arr, 45);
        // binarySearchDesc(arr2, 45);
        orderAgnosticbinarySearch(arr2, 45);
        orderAgnosticbinarySearch(arr, 87);
    }

    static void binarySearch(int arr[], int target) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element " + target + " at index: " + ans);
        }
    }

    static void binarySearchDesc(int arr[], int target) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element " + target + " at index: " + ans);
        }
    }

    static void orderAgnosticbinarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            binarySearch(arr, target);
        }

        else {
            binarySearchDesc(arr, target);
        }
    }
}