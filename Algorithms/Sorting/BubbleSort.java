// https://www.geeksforgeeks.org/problems/bubble-sort/1
// Solved this question using below logic

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 1, 5, 4, 6, 3, 0 };
        printArray(arr, "original array");
        bubbleSort(arr);
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

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int passes = n - 2;
        for (int i = 0; i <= passes; i++) {
            boolean flag = false;
            for (int j = 0; j <= passes - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
