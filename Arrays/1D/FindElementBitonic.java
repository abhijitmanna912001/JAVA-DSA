public class FindElementBitonic {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 11, 16, 13, 11, 9, 3, 2, 1 };
        findElementBitonic(arr, 11);
    }

    static void findElementBitonic(int arr[], int target) {
        int index = findPeakElementBitonic(arr);

        if (index == -1 || target > arr[index]) {
            System.out.println("Element does not exist");
        } else {
            if (target == arr[index]) {
                System.out.println("Found element " + arr[index] + " at index: " + index);
                return;
            }

            int ans = binarySearch(arr, 0, index - 1, target);
            if (ans == -1) {
                ans = binarySearchDesc(arr, index + 1, arr.length - 1, target);
            }
            if (ans == -1) {
                System.out.println("Element does not exist");
            } else {
                System.out.println("Found " + arr[ans] + " at: " + ans);
            }
        }
    }

    static int findPeakElementBitonic(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] > arr[prev]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end) {
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

    static int binarySearchDesc(int arr[], int start, int end, int target) {
        int ans = -1;

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

        return ans;
    }
}
