public class MinimumAbsDiffer {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 4, 5, 7, 9, 25, 56, 88, 94 };
        minimumAbsDifference(arr, 0);
    }

    static void minimumAbsDifference(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        int res = 0;

        if (arr.length == 0) {
            return;
        }

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
            if (end == -1) {
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            } else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = (ans1 < ans2) ? ans1 : ans2;
            }
        }

        System.out.println("Minimum Absolute difference is: " + res);
    }
}
