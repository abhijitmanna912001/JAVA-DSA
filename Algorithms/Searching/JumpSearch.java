public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 11, 34, 45, 65, 77 };
        int index = jumpSearch(arr, 34);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element at index: " + index);
        }
    }

    public static int jumpSearch(int arr[], int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int startIndex = 0;
        int endIndex = blockSize;

        while (endIndex < n && arr[endIndex] <= target) {
            startIndex = endIndex;
            endIndex += blockSize;
            if (endIndex > n) {
                endIndex = n;
            }
        }

        int res = -1;
        for (int i = startIndex; i < endIndex; i++) {
            if (target == arr[i]) {
                res = i;
            }
        }

        return res;
    }
}