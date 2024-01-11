// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// Solved these questions using below logic

public class CeilandFloor {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int result = floorSearch(arr, 17);
        System.out.println("Floor value is: " + result);

        int result1 = CeilSearch(arr, 17);
        System.out.println("Ceil value is: " + result1);
    }

    static int floorSearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int CeilSearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return ans;
    }
}
