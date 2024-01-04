public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 4, 5, 3 };
        linearSearch(arr, 4);
    }

    public static void linearSearch(int arr[], int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Found element at pos: " + ans);
        }
    }
}