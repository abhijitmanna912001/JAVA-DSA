public interface ExponentialSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 11, 15, 30 };
        int index = exponentialSearch(arr, 11);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element at index " + index);
        }
    }

    public static int exponentialSearch(int arr[], int target) {
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        int n = arr.length;

        while (i < n && arr[i] <= target) {
            i = 2 * i;
        }

        int end = Math.min(i, n - 1);
        int index = binarySearchInRange(arr, target, i / 2, end);

        return index;
    }

    static int binarySearchInRange(int arr[], int target, int start, int end) {
        int ans = -1;

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

        return ans;
    }

}
