public class MaxElementRotated {
    public static void main(String[] args) {
        int arr[] = { 43, 2, 4, 5, 7, 11 };
        int index = maxElement(arr);
        System.out.println(arr[index]);
    }

    static int maxElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
