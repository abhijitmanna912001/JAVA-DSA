public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 4, 5, 3 };
        // linearSearch(arr, 3, false);
        // linearSearch(arr, 3, true);
        linearSearchMultiple(arr, 3);
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
}