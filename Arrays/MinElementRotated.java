// https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// Solved GFG and Leetcode questions using this logic

public class MinElementRotated {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 11, 43 };
        int res = minElement(arr);
        System.out.println(arr[res]);
    }

    static int minElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
