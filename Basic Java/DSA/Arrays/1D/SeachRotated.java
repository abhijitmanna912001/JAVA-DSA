// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// https://www.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// https://www.geeksforgeeks.org/problems/search-in-rotated-array-2/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Solved these GFG and Leetcode Questions using below logics

public class SeachRotated {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 0, 0, 1, 2 };
        int res = searchElementRotatedDuplicates(arr, 3);
        System.out.println(res);
    }

    static int searchElementRotated(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }

    static int searchElementRotatedDuplicates(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Handle duplicates at the start
            while (start < mid && arr[start] == arr[mid]) {
                start++;
            }

            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Handle duplicates at the end
                while (mid < end && arr[mid] == arr[end]) {
                    end--;
                }

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }
}
