// https://www.geeksforgeeks.org/problems/insertion-sort/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// Solved this GFG question using below logic

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 9, 5, 1, 4, 6, 1 };
        printArray(arr, "original array");
        insertSort(arr);
        printArray(arr, "sorted array");
    }

    public static void printArray(int arr[], String message) {
        System.out.println("Printing " + message);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void insertSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}