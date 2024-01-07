// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// Solved this question using below logic

public class FloorArray {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int result = floorSearch(arr, 17);
        System.out.println("Ans is: " + result);
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
}
