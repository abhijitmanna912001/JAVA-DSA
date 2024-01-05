// https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// https://leetcode.com/problems/search-a-2d-matrix/description/
// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
// Solved these three questions using Linear Search in a 2D Array logic

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 4, 5, 3 };
        // linearSearch(arr, 3, false);
        // linearSearch(arr, 3, true);
        // linearSearchMultiple(arr, 3);
        int arr2d[][] = {
                { 2, 4, 1, 5, 1 },
                { 6, 7, 3, 4, 2 },
                { 8, 1, 2, 2, 3 },
                { 5, 5, 5, 8, 4 }
        };
        linearSearch2DArray(arr2d, 4, false);
    }

    public static void linearSearch(int arr[], int target, boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                if (findLast == false) {
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Found element at pos: " + ans);
        }
    }

    public static void linearSearchMultiple(int arr[], int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element is not present in array");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Found element at pos: " + ans[i]);
            }
        }
    }

    public static void linearSearch2DArray(int arr[][], int target, boolean findLast) {
        int outerIndex = -1;
        int innerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    outerIndex = i;
                    innerIndex = j;
                    if (findLast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if (found == true) {
                break;
            }
        }
        if (outerIndex == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Found element at pos: " + outerIndex + "," + innerIndex);
        }
    }
}