public class InterpolationSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 11, 34, 45, 65, 77 };
        int index = interpolationSearch(arr, 2);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    static int interpolationSearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end && target >= arr[start] && target <= arr[end]) {
            if (arr[start] == arr[end]) {
                if (arr[start] == target) {
                    ans = start;
                }
                break;
            }

            int pos = start + (target - arr[start]) * (end - start) / (arr[end] - arr[start]);

            if (arr[pos] == target) {
                ans = pos;
                break;
            } else if (target < arr[pos]) {
                end = pos - 1;
            } else {
                start = pos + 1;
            }
        }

        return ans;
    }
}
